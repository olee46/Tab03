package jp.gr.conf_java.oleeapps.tab03;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set Fragment to ViewPager
        FragmentManager manager = getSupportFragmentManager();
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        MyAdapter adapter = new MyAdapter(manager);
        viewPager.setAdapter(adapter);

        // set TabLayout
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
