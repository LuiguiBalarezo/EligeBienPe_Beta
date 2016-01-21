package com.toquescript.eligebienpe_beta;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapters.SolventRecyclerViewAdapter;
import layout.SignUpFragment;
import layout.SignFragment;
import layout.LoginFragment;
import layout.ForgotPasswordFragment;
import models.Candidates;

public class MainActivity extends AppCompatActivity implements LoginFragment.EventsLogin {

    public static Context mContext;
    public static Activity mActivity;
    private Intent intent;

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    SolventRecyclerViewAdapter rcAdapter;
    RecyclerView recyclerView;

    FragmentManager fm;
    FragmentTransaction ft;

    Fragment fragment_login, fragment_crearcuenta, fragment_entrar, fragment_olvidocontrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();

        mContext = getApplicationContext();
        mActivity = MainActivity.this;

        fragment_login = new LoginFragment();
        fragment_crearcuenta = new SignUpFragment();
        fragment_entrar = new SignFragment();
        fragment_olvidocontrasena = new ForgotPasswordFragment();


        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container, fragment_login).addToBackStack(null).commit();
        }


        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_login_candidate);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);
        recyclerView.setHasFixedSize(true);
        List<Candidates> gaggeredList = getListItemData();

        rcAdapter = new SolventRecyclerViewAdapter(gaggeredList);
        recyclerView.setAdapter(rcAdapter);

    }

    private List<Candidates> getListItemData() {
        List<Candidates> listViewItems = new ArrayList<>();
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));
        listViewItems.add(new Candidates(R.drawable.three));

        return listViewItems;
    }


    @Override
    public void onClikEntrar() {
        Toast.makeText(mContext, "entrar", Toast.LENGTH_SHORT).show();
        transactionFragments(fragment_entrar, true);
    }

    @Override
    public void onClickCrear() {
        Toast.makeText(mContext, "Crear", Toast.LENGTH_SHORT).show();
        transactionFragments(fragment_crearcuenta, true);
    }
    @Override
    public void onClickContrasena() {
        Toast.makeText(mContext, "Contrase;a", Toast.LENGTH_SHORT).show();
        transactionFragments(fragment_olvidocontrasena, true);
    }

    @Override
    public void onClickInvitado() {
        Toast.makeText(mContext, "invitado", Toast.LENGTH_SHORT).show();
        intent = new Intent(mContext, MainActivityPrincipal.class);
        startActivity(intent);
    }


    private void transactionFragments(Fragment f, boolean isaddToBack) {
        ft = fm.beginTransaction();
        ft.replace(R.id.container, f);
        if (isaddToBack) {
            ft.addToBackStack(null);
        }
        ft.commit();
    }

}