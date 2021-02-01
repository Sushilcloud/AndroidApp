package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class healthcareproductdetails extends AppCompatActivity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.daburchyawanprash,R.drawable.honey,R.drawable.glucose,R.drawable.hajmola,
            R.drawable.hajmolacandy,R.drawable.pudinhara,R.drawable.pudinharalemonfizz,R.drawable.isbgol,R.drawable.naturecare
            ,R.drawable.naturecareregular,R.drawable.naturecareisabgolpowder,R.drawable.honituscoughtsyrup,R.drawable.honituscoughdrops
            ,R.drawable.honitusmadhuvaani,R.drawable.shilajitsmall,R.drawable.shilajitxoil,R.drawable.dashmularisht
            ,R.drawable.activebloodpurifier,R.drawable.ashokarishta,
            R.drawable.babylaltail,R.drawable.babyjanamghutti,R.drawable.babygripewater,R.drawable.babymessageoil};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthcareproductdetails);

        init();
    }
    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter_Pager(healthcareproductdetails.this,XMENArray));
        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 20000, 20000);
    }


}
