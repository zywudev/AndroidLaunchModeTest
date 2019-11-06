package com.wuzy.androidlaunchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleTopActivity extends AppCompatActivity {
    private static final String TAG = "SingleTopActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        Log.e(TAG, "taskId:" + getTaskId());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "onNewIntent: ");
    }

    public void startStandardActivity(View view) {
        Intent intent = new Intent(this, StandardActivity.class);
        startActivity(intent);
    }

    public void startSingleTopActivity(View view) {
        startActivity(new Intent(this, SingleTopActivity.class));
    }


}
