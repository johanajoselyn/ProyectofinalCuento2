package com.example.a.leemeya2;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class menu_principal extends AppCompatActivity {

    private android.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_Navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SeleccionFragment()).commit();


        ///----

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///---
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.persona_id:
                            selectedFragment = new SeleccionFragment2();
                            break;
                        case R.id.fav_id:
                            selectedFragment = new SeleccionFragment();
                            break;
                        case R.id.recientes_id:
                            selectedFragment = new SeleccionFragment();
                            break;

                    }
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };


    @Override
    public boolean onCreateOptionsMenu(Menu m) {
        getMenuInflater().inflate(R.menu.main, m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int iditem = item.getItemId();
        Intent intent = new Intent(this, menu_principal.class);

        //noinspection SimplifiableIfStatement
        switch (iditem) {
            case R.id.item1:
                startActivity(intent);
                return true;

            case R.id.item2:
                startActivity(intent);
                return true;

        }
        return true;
    }
}
