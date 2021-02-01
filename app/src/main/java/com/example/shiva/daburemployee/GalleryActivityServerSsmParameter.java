package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivityServerSsmParameter extends AppCompatActivity {

    private static final String TAG = "GalleryActivityServerSsmParameter";

    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_server_ssm_parameter);

        // Log.d(TAG, "onCreate: started.");

        getIncomingIntent();

        button=findViewById(R.id.schemeandmargin);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivityServerSsmParameter.this,Scheme_All_Division_Recycler_Server.class);
                startActivity(intent);
            }
        });


    }



    private void getIncomingIntent(){
        //  Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            //      Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");

            setImage(imageUrl, imageName);
        }
    }


    private void setImage(String imageUrl, String imageName){
        //   Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);



        ImageView image = findViewById(R.id.image);




        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }

}
