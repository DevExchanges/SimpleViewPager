package info.devexchanges.viewpager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SimplePagerAdapter extends PagerAdapter {
    private Activity activity;

    public SimplePagerAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) activity.getApplicationContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.item_viewpager, container, false);
        TextView textView = (TextView) itemView.findViewById(R.id.number);

        textView.setText(String.format("Page: %d", position + 1));

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
