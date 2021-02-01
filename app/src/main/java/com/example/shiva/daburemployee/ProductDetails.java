package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class ProductDetails extends AppCompatActivity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN=

            {R.drawable.orangeltr,R.drawable.mangoltr,R.drawable.mixltr, R.drawable.pineappleltr,
                    R.drawable.guavaltr,R.drawable.litchiltr,R.drawable.appleltr,R.drawable.pomegranateltr,
                    R.drawable.mosambiltr
                    ,R.drawable.grapeltr,R.drawable.jamunltr,R.drawable.tomatoltr,R.drawable.cranberryltr,
                    R.drawable.apricotltr,R.drawable.alphansoltr,R.drawable.masalaguava,R.drawable.masalapome,
                    R.drawable.masalamix,
                    R.drawable.mixbarries,

                    R.drawable.orange200ml,R.drawable.mango200ml
                    ,R.drawable.mix200ml,R.drawable.pineapple200ml,R.drawable.guava200ml,R.drawable.litchi200ml
                    ,R.drawable.apple200ml,R.drawable.pome200ml,R.drawable.mosambi200ml,R.drawable.grape200ml,
                    R.drawable.jamun200ml,
                    R.drawable.cranberry200ml,

                    R.drawable.coconutwater,


                    R.drawable.activemixltr,R.drawable.activeorangeltr,R.drawable.activeorangecarrorltr,
                    R.drawable.beetrootltr,
                    R.drawable.cucumberltr,
                    R.drawable.multifiberltr,R.drawable.orangecitrusltr,

                    R.drawable.gingergarlic100,R.drawable.gingergarlic200
                    ,R.drawable.ginger200,R.drawable.garlic200,R.drawable.tomatopuree,R.drawable.coconutmilk,R.drawable.lemoneez
                    ,R.drawable.tamarind200};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        init();
    }
    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter_Pager(ProductDetails.this,XMENArray));
       // CircleIndicator indicator = findViewById(R.id.indicator);
       // indicator.setViewPager(mPager);

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
