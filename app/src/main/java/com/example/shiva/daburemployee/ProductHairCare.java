package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class ProductHairCare extends AppCompatActivity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.amlahairoil,R.drawable.vatikaenrichedcoconuthairoilsmal,
            R.drawable.almondhairoil,R.drawable.vatikaenrichedolivehairoil,
            R.drawable.vatikajasminehairoil,R.drawable.vatikaenrichedcoconutoilwithhibiscus
            ,R.drawable.vatikaenrichedcoconuthairoilsmal,R.drawable.vatikabb
            ,R.drawable.almondnourishmentnowinashampoo,R.drawable.vatikahealthshampoosmall
            ,R.drawable.vatikablackshineshampoosmall,R.drawable.vatikaantidandruffshampoosmall};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_hair_care);
        init();
    }
    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter_Pager(ProductHairCare.this,XMENArray));
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
