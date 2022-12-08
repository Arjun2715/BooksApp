package com.example.activity3v1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class Activity1Login extends AppCompatActivity {
    private MaterialButton Login;
    private EditText password;
    private EditText username;
    private ImageView Google;
    private ImageView Facebook;
    private ImageView Twitter;

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Activity1Login.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Login = findViewById(R.id.Login_btn);
        Google = findViewById(R.id.google);
        Facebook = findViewById(R.id.facebook);
        Twitter = findViewById(R.id.twitter);


        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoogle();
            }
        });
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFacebook();
            }
        });
        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentwitter();
            }
        });


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        if (username.getText().toString().equalsIgnoreCase("admin") && password.getText().toString().equalsIgnoreCase("admin")) {
            //correct
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);//it starts new activity
        } else {
            loginFailed();//this calls faild login message method
        }
    }

    private void loginFailed() { //login fails this error message shows next to the password field.
        password.setError("Password or Username didn't match");
    }


    private void openGoogle() {
        Uri uri = Uri.parse("https://www.google.com"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openFacebook() {
        Uri uri = Uri.parse("https://www.facebook.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void opentwitter() {
        Uri uri = Uri.parse("https://www.twitter.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}