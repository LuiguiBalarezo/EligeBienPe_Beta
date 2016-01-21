package com.toquescript.eligebienpe_beta;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import layout.CandidatesFragment;

public class MainActivityPrincipal extends AppCompatActivity {

    public static Context mContext;
    public static Activity mActivity;

    FragmentManager fm;
    FragmentTransaction ft;

    Fragment fragment_candidates;


    //<editor-fold desc="Views">
    Toolbar toolbar;
    TabLayout tabLayout;
//    ViewPager viewPager;ViewPager viewPager;
    //</editor-fold>

    public void createInstance() {
        getSupportFragmentManager().beginTransaction().add(R.id.container_main, fragment_candidates).commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        fm = getSupportFragmentManager();
        mContext = getApplicationContext();
        mActivity = MainActivityPrincipal.this;


        //<editor-fold desc="Cast Views">
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Candidatos Presidenciales");
        //</editor-fold>

        fragment_candidates = new CandidatesFragment();


        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container_main, fragment_candidates).commit();
        }

    }
}
