package com.bttprogramingtraining.bttmanagement.adapters;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class RegisterStatePagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<String> mFragmentTitles;
    ArrayList<Fragment> mFragments;

    public RegisterStatePagerAdapter(FragmentManager fm) {
        super(fm);
        mFragmentTitles = new ArrayList<>();
        mFragments = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void addTab(Fragment frag, String title) {
        mFragmentTitles.add(title);
        mFragments.add(frag);
    }
}
