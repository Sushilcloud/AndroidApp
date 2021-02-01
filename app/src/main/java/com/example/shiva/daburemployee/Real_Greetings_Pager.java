package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Real_Greetings_Pager extends AppCompatActivity {

    // View Pager Variabl
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;

    private String[] urls = new String[]{

            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F1.jpg?alt=media&token=db276626-f143-4d38-8d59-b57f44ff916b",

            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F2.jpg?alt=media&token=c0b525a3-aad4-4cfb-bd4b-bb0c89619dcf",

            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F3.jpg?alt=media&token=43abbf2c-b109-452f-9689-cbe4e472d147",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F4.jpg?alt=media&token=5a042a2a-d4b9-49e1-b4d0-22cb8b4d6d43",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F5.jpg?alt=media&token=5412b6b0-a12b-4de0-9da6-e094ecefd754",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F6.jpg?alt=media&token=69e2f2db-2085-4b78-b883-6c207f469b38",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F7.jpg?alt=media&token=c3b9d748-4bad-45b4-a3a2-18cc1cef92a1",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F8.jpg?alt=media&token=e8cc6b3e-4b4a-49f3-a4f9-2bf29ed90d09",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F9.jpg?alt=media&token=291e1ca7-9899-4c7c-b8e3-0370f2cf1e77"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real__greetings__pager);


        //View Pager Code Here
        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(Real_Greetings_Pager.this, urls));
    }
}
