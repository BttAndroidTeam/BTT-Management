package com.bttprogramingtraining.bttmanagement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class RegistrationActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabs);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpViewPager(ViewPager viewPager) {
        RegisterStatePagerAdapter mRegisterStatePagerAdapter = new RegisterStatePagerAdapter(getSupportFragmentManager());
        mRegisterStatePagerAdapter.addTab(new StudentRegistrationFormFragment(), "Register");
        mRegisterStatePagerAdapter.addTab(new FeeFormFragment(), "Fees");
        viewPager.setAdapter(mRegisterStatePagerAdapter);
    }


}
