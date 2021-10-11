package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MyActivity";
    public static final String EXTRA_MESSAGE =
            "com.example.android.myapplocation.extra.MESSAGE";
    public int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();
    }
public void  find(){
        mShowCount=(TextView) findViewById(R.id.show_count);
}
    public void Counter(View view) {
        mCount++;
        Log.d(LOG_TAG, "Button clicked!");

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void SayHello(View view) {
        Intent intent = new Intent(this, HelloToast.class);

        intent.putExtra(EXTRA_MESSAGE, Integer.toString(mCount));
        startActivity(intent);
    }
}