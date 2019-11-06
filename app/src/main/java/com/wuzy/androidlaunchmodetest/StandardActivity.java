package com.wuzy.androidlaunchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StandardActivity extends AppCompatActivity {
    private static final String TAG = "StandardActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        Log.e(TAG, "taskId:" + getTaskId());
    }

    public void startStandardActivity(View view) {
        Intent intent = new Intent(this, StandardActivity.class);
        startActivity(intent);
    }


    public void startSingleTopActivity(View view) {
        startActivity(new Intent(this,SingleTopActivity.class));
    }

    public void startSingleTaskActivity(View view) {
        startActivity(new Intent(this,SingleTaskActivity.class));
    }

    public void startSingleTaskWithAffinityActivity(View view) {
        startActivity(new Intent(this,SingleTaskWithAffinityActivity.class));
    }

    public void startSingleInstanceActivity(View view) {
        Intent intent = new Intent(this, SingleInstanceActivity.class);
        startActivity(intent);
    }

}
