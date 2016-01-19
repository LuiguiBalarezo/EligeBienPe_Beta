package com.toquescript.eligebienpe_beta;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import layout.Fragment_Principal;

public class MainActivityPrincipal extends AppCompatActivity {

    public static Context mContext;
    public static Activity mActivity;

    FragmentManager fm;
    FragmentTransaction ft;

    Fragment fragment_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        fm = getSupportFragmentManager();
        mContext = getApplicationContext();
        mActivity = MainActivityPrincipal.this;

        fragment_principal = new Fragment_Principal();

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container_main, fragment_principal).commit();
        }

    }
}