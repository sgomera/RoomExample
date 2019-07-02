package com.example.roomexample;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //per carregar el fragment programàticament:
    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //per carregar el Home_Fragment programàticament:
        //inicialització del fragment manager:
        //fragmentManager = getSupportFragmentManager();
        fragmentManager = getSupportFragmentManager();
        if (findViewById(R.id.fragment_container) == null) {
        } else {
            if (savedInstanceState != null) {
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container, new HomeFragment()).commit();
        }
    }
}
