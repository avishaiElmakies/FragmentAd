package com.example.android.fragmentad;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 3/6/2018.
 */

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentList=new ArrayList <>();
    private List<String> stringList=new ArrayList <>();
    public void addFragment(Fragment f,String s){
        fragmentList.add(f);
        stringList.add(s);
    }
    public SectionStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
