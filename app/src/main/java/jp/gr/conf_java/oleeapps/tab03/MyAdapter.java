package jp.gr.conf_java.oleeapps.tab03;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by orisa on 2018/01/28.
 */

public class MyAdapter extends FragmentPagerAdapter {
    private static final int NUM_ITEMS = 3;

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "ページ" + (++position);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return MyFragment.newInstance(android.R.color.holo_blue_dark);
            case 1:
                return MyFragment.newInstance(android.R.color.holo_green_dark);
            case 2:
                return MyFragment.newInstance(android.R.color.holo_red_dark);
        }
        return null;
    }
}
