package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GetYourRateRecyclerView extends AppCompatActivity {

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_your_rate_recycler_view);



        imageView = findViewById(R.id.image);

        String url = "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Month%2F1.png?alt=media&token=bd061417-1c49-4995-bdc9-b691951f4ad8";//Retrieved url as mentioned above

        Glide.with(getApplicationContext()).load(url).into(imageView);

        initImageBitmaps();
    }

    private void initImageBitmaps() {


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/GetRate%2Ffoods.png?alt=media&token=4b4bacc8-71d9-4256-84f1-845ad9168e7b");
        mNames.add("DABUR FOOD'S ");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Freal200ml.png?alt=media&token=9acc5367-c101-4ad9-b458-b81e4faac304");
        mNames.add("HC-BASE ");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Factiveltr.png?alt=media&token=b10c266d-2dee-43ae-82b9-818d7af99567");
        mNames.add("HC-OTC");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Freal200ml.png?alt=media&token=9acc5367-c101-4ad9-b458-b81e4faac304");
        mNames.add("HPC");



        initRecyclerView();
    }
    private void initRecyclerView(){
        // Log.d(TAG, "initRecyclerView: initrecyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        GetRateAdapterServer adapter = new GetRateAdapterServer(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}