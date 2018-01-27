package jp.gr.conf_java.oleeapps.tab03;

import  android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by orisa on 2018/01/28.
 */

public class MyFragment extends Fragment {
    private final static String BG_COLOR = "'bg_color";

    public static MyFragment newInstance(@ColorRes int idRes) {
        MyFragment fragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(BG_COLOR, idRes);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, null);
        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.fragment_main_linearLayout);
        linearLayout.setBackgroundResource(getArguments().getInt(BG_COLOR));
        return view;
    }
}
