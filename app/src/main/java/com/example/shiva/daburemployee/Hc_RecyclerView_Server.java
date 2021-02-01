package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Hc_RecyclerView_Server extends AppCompatActivity {

    ImageView imageView;

    private static final String TAG="Hc_RecyclerView_Server";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hc__recycler_view__server);

        Log.d(TAG, "onCreate: started.");

        imageView=findViewById(R.id.image);

        String url="https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Month%2F1.png?alt=media&token=bd061417-1c49-4995-bdc9-b691951f4ad8";//Retrieved url as mentioned above

        Glide.with(getApplicationContext()).load(url).into(imageView);





        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fhoney.png?alt=media&token=bce8febf-4487-4320-8306-d084447fa361");
        mNames.add("HONEY");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fhajmola.png?alt=media&token=f8c78752-0b0d-40d2-8c38-626fb14251ec");
        mNames.add("HAJMOLA");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fkeora.png?alt=media&token=a50825d5-6e6e-429c-896a-bb77d134dd98");
        mNames.add("KEORA");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fsharabat-min.png?alt=media&token=c9a27152-a203-4f8f-8373-fec65280d1ea");
        mNames.add("SHARABAT-E-AJAM");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fchyawanprash.png?alt=media&token=83af8ae5-564f-4d9a-bbdb-ce294dee5aa3");
        mNames.add("DABUR CHYAWANPRASH");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fglucose.png?alt=media&token=8d65d6cd-cec2-4cd7-b412-3461f308cdf6");
        mNames.add("DABUR GLUCOSE");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Flaltail.png?alt=media&token=5b499d6d-fcf6-41ad-86cc-492ebe786e0e");
        mNames.add("DABUR LAL TAIL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fodomos.png?alt=media&token=6a9dc3df-c2bc-46b7-9674-8c7848e1b910");
        mNames.add("DABUR ODOMOS");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fseasonplan1.png?alt=media&token=ac544940-9d92-4619-87b4-d5dbb68878d2");
        mNames.add("SEASON PLAN 1");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fseasonplan2.png?alt=media&token=d8d33f99-8ee0-42ed-a0fb-77cf0e27d7f9");
        mNames.add("SEASON PLAN 2");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcBase%2Fseasonplan3.png?alt=media&token=8b42dec5-0d26-4232-a90a-05ce4ef1eadb");
        mNames.add("SEASON PLAN 1");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerAdapterServerAllScheme adapter = new RecyclerAdapterServerAllScheme(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}