package info.devexchanges.viewpager;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.indicator);

        PagerAdapter adapter = new SimplePagerAdapter(this);
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
    }
}
