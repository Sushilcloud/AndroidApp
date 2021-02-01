package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SsmParameter extends AppCompatActivity {

    ImageView imageView;

    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssm_parameter);

        imageView=findViewById(R.id.image);

        String url="https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Month%2F1.png?alt=media&token=bd061417-1c49-4995-bdc9-b691951f4ad8";//Retrieved url as mentioned above

        Glide.with(getApplicationContext()).load(url).into(imageView);

        button=findViewById(R.id.foodssm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SsmParameter.this,FoodSsm_Incentive_Recycler_Server.class);
                startActivity(intent);
            }
        });

        button=findViewById(R.id.hcssm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SsmParameter.this,HcSsm_Incentive_Recycler_Server.class);
                startActivity(intent);
            }
        });

        button=findViewById(R.id.hpcssm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SsmParameter.this,HpcSsm_Incentive_Recycler_Server.class);
                startActivity(intent);
            }
        });

    }
}