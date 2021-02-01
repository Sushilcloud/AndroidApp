package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Scheme_All_Division_Recycler_Server extends AppCompatActivity {

    ImageView imageView;


    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme__all__division__recycler__server);


        imageView=findViewById(R.id.image);

        String url="https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Month%2F1.png?alt=media&token=bd061417-1c49-4995-bdc9-b691951f4ad8";//Retrieved url as mentioned above

        Glide.with(getApplicationContext()).load(url).into(imageView);

        button=findViewById(R.id.hcbase);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hcbase();
            }
        });

        button=findViewById(R.id.hcotc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hcotc();
            }
        });

        button=findViewById(R.id.food);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                food();
            }
        });

        button=findViewById(R.id.hpc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hpc();
            }
        });

        button=findViewById(R.id.foodskubase);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scheme_All_Division_Recycler_Server.this,Foods_All_Margin_Details.class);
                startActivity(intent);
            }
        });

        button=findViewById(R.id.hcbasesku);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scheme_All_Division_Recycler_Server.this,Hc_Margin_Details.class);
                startActivity(intent);
            }
        });



        button=findViewById(R.id.hcotcsku);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scheme_All_Division_Recycler_Server.this,Hc_Otc_Margin_Details.class);
                startActivity(intent);
            }
        });

        button=findViewById(R.id.hpcsku);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scheme_All_Division_Recycler_Server.this,Hpc_Margin_Details.class);
                startActivity(intent);
            }
        });



    }

    public void hcbase()
    {
        Intent intent = new Intent(Scheme_All_Division_Recycler_Server.this,Hc_RecyclerView_Server.class);
        startActivity(intent);
    }

    public void hcotc()
    {
        Intent intent = new Intent(Scheme_All_Division_Recycler_Server.this,Hc_Otc_RecyclerView_Server.class);
        startActivity(intent);
    }

    public void food()
    {
        Intent intent = new Intent(Scheme_All_Division_Recycler_Server.this,Food_RecyclerView_Server.class);
        startActivity(intent);
    }

    public void hpc()
    {
        Intent intent = new Intent(Scheme_All_Division_Recycler_Server.this,Hpc_RecyclerView_Server.class);
        startActivity(intent);
    }

}
