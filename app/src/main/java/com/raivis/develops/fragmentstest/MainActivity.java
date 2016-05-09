package com.raivis.develops.fragmentstest;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        android.app.FragmentManager fManager = getFragmentManager();

        android.app.FragmentTransaction fTransaction = fManager.beginTransaction();

        int orient = getResources().getConfiguration().orientation;

        if(orient == Configuration.ORIENTATION_LANDSCAPE)
        {
            LandscapeFragment landscapeFrag = new LandscapeFragment();

            fTransaction.replace(android.R.id.content, landscapeFrag);
        }
        else
        {
            PortraitFragment portraitFrag = new PortraitFragment();

            fTransaction.replace(android.R.id.content, portraitFrag);
        }

        fTransaction.commit();
    }
}
