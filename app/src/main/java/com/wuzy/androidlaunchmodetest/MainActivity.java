package com.wuzy.androidlaunchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "taskId:" + getTaskId());
    }

    public void startStandardActivity(View view) {
        Intent intent = new Intent(this, StandardActivity.class);
        startActivity(intent);
    }

    public void startSingleTopActivity(View view) {
        startActivity(new Intent(this, SingleTopActivity.class));
    }

    public void startSingleTaskActivity(View view) {
        startActivity(new Intent(this, SingleTaskActivity.class));
    }

    public void startSingleInstanceActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SingleInstanceActivity.class);
        startActivity(intent);
    }

    public void startSingleTaskWithAffinityActivity(View view) {
        startActivity(new Intent(this, SingleTaskWithAffinityActivity.class));
    }

    public void startIntentFlagTestActivity(View view) {
        Intent intent = new Intent(MainActivity.this, IntentFlagTestActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void startIntentFlagTestWithAffinityActivity(View view) {
        Intent intent = new Intent(MainActivity.this, IntentFlagTestWithAffinityActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
