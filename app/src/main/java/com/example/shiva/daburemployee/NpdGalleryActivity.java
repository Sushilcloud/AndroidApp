package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class NpdGalleryActivity extends AppCompatActivity {
    private static final String TAG = "NpdGalleryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npd_gallery);
        Log.d(TAG,"onCreate: started");


        getIncomingIntent();
    }

    private void getIncomingIntent()
    {
        Log.d(TAG," getIncomingIntent: checking for incoming intent");
        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name"))
        {
            Log.d(TAG,"getIncomingIntent: found intent extras");
            String imageUrl=getIntent().getStringExtra("image_url");
            String imageName=getIntent().getStringExtra("image_name");

            setImage(imageUrl,imageName);
        }
    }

    private void setImage(String imageUrl,String imageName)
    {
        Log.d(TAG,"setImage: setting to image and name to widget");

        TextView name=findViewById(R.id.image_description);
        name.setText(imageName);

        ImageView image=findViewById(R.id.image);

        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }

}
