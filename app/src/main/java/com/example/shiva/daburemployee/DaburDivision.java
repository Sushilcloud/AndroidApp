package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaburDivision extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dabur_division);

        button=findViewById(R.id.ProductRecycler);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productrecycler();
            }
        });

        button=findViewById(R.id.HealthCareRecycler);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                healthcarerecycler();
            }
        });

        button=findViewById(R.id.HairCareRecycler);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                haircarerecycler();
            }
        });

        button=findViewById(R.id.OralCare);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oralcare();
            }
        });

        button=findViewById(R.id.SkinCare);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skincare();
            }
        });

        button=findViewById(R.id.HomeCare);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homecare();
            }
        });



    }
    public void productrecycler()
    {
        Intent intent = new Intent(DaburDivision.this,ProductDetails.class);
        startActivity(intent);
    }

    public void healthcarerecycler()
    {
        Intent intent = new Intent(DaburDivision.this,healthcareproductdetails.class);
        startActivity(intent);
    }

    public void haircarerecycler()
    {
        Intent intent = new Intent(DaburDivision.this,ProductHairCare.class);
        startActivity(intent);
    }

    public void skincare()
    {
        Intent intent = new Intent(DaburDivision.this,ProductSkinCare.class);
        startActivity(intent);
    }

    public void oralcare()
    {
        Intent intent = new Intent(DaburDivision.this,ProductOralCare.class);
        startActivity(intent);
    }

    public void homecare()
    {
        Intent intent = new Intent(DaburDivision.this,ProductHomeCare.class);
        startActivity(intent);
    }
    }

