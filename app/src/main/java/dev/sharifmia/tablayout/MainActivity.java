package dev.sharifmia.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.myViewPager);

        setupPagerAdapter(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }

    public void setupPagerAdapter(ViewPager viewPager){

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new HomePage(),"Home Page");
        viewPagerAdapter.addFragment(new FavoritePage(),"Favorite Page");
        viewPagerAdapter.addFragment(new SearchPage(),"Search Page");
        viewPager.setAdapter(viewPagerAdapter);

    }

}
