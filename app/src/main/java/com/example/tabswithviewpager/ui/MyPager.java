package com.example.tabswithviewpager.ui;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabswithviewpager.fragments.HomeFragment;
import com.example.tabswithviewpager.fragments.JavaFragment;
import com.example.tabswithviewpager.fragments.KotlinFragment;
import com.example.tabswithviewpager.fragments.PhpFragment;

public class MyPager extends FragmentPagerAdapter {

    private Context context;
    private Integer totalTabs;

    public MyPager(Context context, @NonNull FragmentManager fm, Integer totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;

            case 1:

                JavaFragment javaFragment = new JavaFragment();
                return javaFragment;

            case 2:
                PhpFragment phpFragment = new PhpFragment();
                return phpFragment;

            case 3:
                KotlinFragment kotlinFragment = new KotlinFragment();
                return kotlinFragment;

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
