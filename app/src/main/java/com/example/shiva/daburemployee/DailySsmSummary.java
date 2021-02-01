package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

import androidx.annotation.NonNull;
import java.util.HashMap;

public class DailySsmSummary extends AppCompatActivity {

    private EditText date,name,town,beatname,petoutlet,petcase,kooleroutlet,koolercase,milkshakeoutlet,milkshakecase;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_ssm_summary);


        date=findViewById(R.id.date);

        name=findViewById(R.id.name);
        town=findViewById(R.id.town);
        beatname=findViewById(R.id.beatname);

        petoutlet=findViewById(R.id.petoutlet);
        petcase=findViewById(R.id.petcase);
        kooleroutlet=findViewById(R.id.koolerOutlet);
        koolercase=findViewById(R.id.koolerCase);

        milkshakeoutlet=findViewById(R.id.milkshakeOutlet);
        milkshakecase=findViewById(R.id.milkshakeCase);

        save=findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //for toast a message ony this single line code
                Toast.makeText(getApplicationContext(),"Save Successfully", Toast.LENGTH_SHORT).show();

                HashMap<String,Object> map= new HashMap<>();
                map.put("date",date.getText().toString());
                map.put("name",name.getText().toString());
                map.put("town",town.getText().toString());
                map.put("beatname",beatname.getText().toString());

                map.put("petoutlet",petoutlet.getText().toString());
                map.put("petcase",petcase.getText().toString());

                map.put("kooleroutlet",kooleroutlet.getText().toString());
                map.put("koolercase",koolercase.getText().toString());

                map.put("milkshakeoutlet",milkshakeoutlet.getText().toString());
                map.put("milkshakecase",milkshakecase.getText().toString());




                FirebaseDatabase.getInstance().getReference().child("DailySSMSummary").push().setValue(map)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Log.i("abc", "onComplete: ");
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("abc", "onFailure: "+e.toString());
                    }
                });
            }
        });
    }
}

//firebase Real time database rule seetting
/*
{
        "rules": {
        ".read": true,
        ".write": true
        }
        }*/

// Create a database on firebase
// only above codes and put data to firebase
