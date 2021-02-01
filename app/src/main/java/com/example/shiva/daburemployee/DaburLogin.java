package com.example.shiva.daburemployee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class DaburLogin extends AppCompatActivity {

    private static final String FILE_NAME ="myFile" ;
    EditText inputEmail,inputPassword;
    Button login;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dabur_login);

        inputEmail=findViewById(R.id.email);
        inputPassword=findViewById(R.id.password);
        login=findViewById(R.id.login);
        checkBox=findViewById(R.id.rememberuser);


        SharedPreferences sharedPreferences=getSharedPreferences(FILE_NAME,MODE_PRIVATE);
        String email=sharedPreferences.getString("username","");
        String password=sharedPreferences.getString("password","");

        inputEmail.setText(email);
        inputPassword.setText(password);





        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(inputEmail.getText().toString()))
                {
                    Toast.makeText(DaburLogin.this,"Please Enter Email",Toast.LENGTH_SHORT).show();
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(inputEmail.getText().toString()).matches())

                {
                    Toast.makeText(DaburLogin.this,"Please Enter Valid Email Address",Toast.LENGTH_SHORT).show();
                }

                else if(TextUtils.isEmpty(inputPassword.getText().toString()))
                {
                    Toast.makeText(DaburLogin.this,"Please Enter Password",Toast.LENGTH_SHORT).show();
                }

                else if(inputPassword.getText().toString().length()<6)
                {
                    Toast.makeText(DaburLogin.this,"Please Enter 6 or More than Digit password",Toast.LENGTH_SHORT).show();
                }
                else {
                    login();
                }


            }
        });


    }

    private void login() {

            String email=inputEmail.getText().toString();
            String password=inputPassword.getText().toString();

            if(checkBox.isChecked())
            {
                StoreDataUsingSharedPref(email,password);
            }

            Intent intent=new Intent(getApplicationContext(),WelcomeScreen.class);
            startActivity(intent);


        FirebaseAuth.getInstance().signInWithEmailAndPassword(inputEmail.getText().toString(),inputPassword.getText().toString())
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(DaburLogin.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(DaburLogin.this,WelcomeScreen.class));
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(DaburLogin.this, "Failed"+e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void StoreDataUsingSharedPref(String email, String password) {

        SharedPreferences.Editor editor=getSharedPreferences(FILE_NAME,MODE_PRIVATE).edit();

        editor.putString("username",email);
        editor.putString("password",password);
        editor.apply();
    }
}
