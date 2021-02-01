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

public class DailyReport extends AppCompatActivity {

    private EditText date,name,town,beatname,outlet,pet200,pet600,pet1200,koolerz150,milkshake,
    coconutwatertetra,chutney,imli,pickle;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_report);


        date=findViewById(R.id.date);

        name=findViewById(R.id.name);
        town=findViewById(R.id.town);
        beatname=findViewById(R.id.beatname);
        outlet=findViewById(R.id.outletname);
        pet200=findViewById(R.id.pet250ml);
        pet600=findViewById(R.id.pet600ml);
        pet1200=findViewById(R.id.pet1200ml);
        koolerz150=findViewById(R.id.koolerrs10);
        milkshake=findViewById(R.id.milkshake);
        coconutwatertetra=findViewById(R.id.coconutwatertetra);
        chutney=findViewById(R.id.chutney);
        imli=findViewById(R.id.imli);
        pickle=findViewById(R.id.pickle);

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
                map.put("outlet",outlet.getText().toString());
                map.put("pet200",pet200.getText().toString());
                map.put("pet600",pet600.getText().toString());
                map.put("pet1200",pet1200.getText().toString());
                map.put("koolerz150",koolerz150.getText().toString());
                map.put("milkshake",milkshake.getText().toString());
                map.put("coconutwatertetra",coconutwatertetra.getText().toString());
                map.put("chutney",chutney.getText().toString());
                map.put("imli",imli.getText().toString());
                map.put("pickle",pickle.getText().toString());



                FirebaseDatabase.getInstance().getReference().child("Post").push().setValue(map)
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
