package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Food_RecyclerView_Server extends AppCompatActivity {

    private static final String TAG="Food_RecyclerView_Server";

    // Zoom Image Variable
    private ScaleGestureDetector scaleGestureDetector;
    private float mScaleFactor = 1.0f;

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    ImageView imageView;

    private Button getyourrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__recycler_view__server);

        imageView=findViewById(R.id.image);
        // End Here
        getyourrate=findViewById(R.id.getrate);
        getyourrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),GetYourRateRecyclerView.class);
                startActivity(intent);
            }
        });


        String url="https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Month%2F1.png?alt=media&token=bd061417-1c49-4995-bdc9-b691951f4ad8";//Retrieved url as mentioned above

        Glide.with(getApplicationContext())
                .load(url)
                .into(imageView);

        initImageBitmaps();
    }

    private void initImageBitmaps(){



        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Frealltr.png?alt=media&token=27f72136-9ff4-44f2-9092-02f5dbebf4f0");
        mNames.add("REAL LTR");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Freal200ml.png?alt=media&token=9acc5367-c101-4ad9-b458-b81e4faac304");
        mNames.add("REAL 200ML");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Factiveltr.png?alt=media&token=b10c266d-2dee-43ae-82b9-818d7af99567");
        mNames.add("ACTIVE AND FIBER LTR");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Fcoconutwater.png?alt=media&token=cda94e18-dc10-48ca-b232-b3349ca9e2f6");
        mNames.add("ACTIVE COCONUT WATER");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Fpaste.png?alt=media&token=541a432f-7de8-4203-a0d1-f59a6622ba79");
        mNames.add("DABUR HOMMADE PASTE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Ftp.png?alt=media&token=0a19dd94-d268-4fcf-b52d-79ce955775e6");
        mNames.add("DABUR TOMATO PUREE");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FFoods%2Fcapsico.png?alt=media&token=b3f180b9-a245-45a3-8061-cbbaa01213c5");
        mNames.add("DABUR CAPSICO LEMONEEZ COCONUTMILK");





        initRecyclerView();
    }

    private void initRecyclerView(){
        // Log.d(TAG, "initRecyclerView: initrecyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerAdapterServerAllScheme adapter = new RecyclerAdapterServerAllScheme(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
