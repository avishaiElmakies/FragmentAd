package com.example.android.fragmentad;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SectionStatePagerAdapter sectionStatePagerAdapter;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionStatePagerAdapter=new SectionStatePagerAdapter(getSupportFragmentManager());
        viewPager=findViewById(R.id.container);
        setUpViewPager(viewPager);


    }
    private void setUpViewPager(ViewPager viewPager){
        SectionStatePagerAdapter adapter=new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"frag 1");
        adapter.addFragment(new Fragment2(),"frag 2");
        adapter.addFragment(new Fragment3(),"frag 3");
        viewPager.setAdapter(adapter);
    }
    public void setViewPager(int fragPos){
        viewPager.setCurrentItem(fragPos);
    }
}
