package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class DaburGreetings extends AppCompatActivity {

    private static final String TAG = "Greetings";

    //vars for Horizontal Recycler View
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dabur_greetings);

        Log.d(TAG, "onCreate: started");
        getImages();

    }
    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F1.jpg?alt=media&token=db276626-f143-4d38-8d59-b57f44ff916b");
        mNames.add("Dabur India Ltd");
        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F2.jpg?alt=media&token=c0b525a3-aad4-4cfb-bd4b-bb0c89619dcf");
        mNames.add("Dabur India Ltd");
        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F3.jpg?alt=media&token=43abbf2c-b109-452f-9689-cbe4e472d147");
        mNames.add("Dabur India Ltd");
        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F4.jpg?alt=media&token=5a042a2a-d4b9-49e1-b4d0-22cb8b4d6d43");
        mNames.add("Dabur India Ltd");
        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F5.jpg?alt=media&token=5412b6b0-a12b-4de0-9da6-e094ecefd754");
        mNames.add("Dabur India Ltd");
        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F6.jpg?alt=media&token=69e2f2db-2085-4b78-b883-6c207f469b38");
        mNames.add("Dabur India Ltd");
        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F7.jpg?alt=media&token=c3b9d748-4bad-45b4-a3a2-18cc1cef92a1");
        mNames.add("Dabur India Ltd");
        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F8.jpg?alt=media&token=e8cc6b3e-4b4a-49f3-a4f9-2bf29ed90d09");
        mNames.add("Dabur India Ltd");
        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/RealGreetings%2F9.jpg?alt=media&token=291e1ca7-9899-4c7c-b8e3-0370f2cf1e77");
        mNames.add("Dabur India Ltd");



        initRecyclerView();

    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView : init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view_horizontal_Greetings);
        RecyclerAdapterServerGreetings adapter = new RecyclerAdapterServerGreetings(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

