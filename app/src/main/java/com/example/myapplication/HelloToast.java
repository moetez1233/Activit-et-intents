package com.example.myapplication;

import static com.example.myapplication.MainActivity.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HelloToast extends AppCompatActivity {
    private static final String LOG_TAG = "MyActivity";
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);
        Bundle extras = getIntent().getExtras();
        newString= extras.getString(EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView2);
        textView.setText(newString);
        Log.d(LOG_TAG,"message");


    }
}