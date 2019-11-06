package com.wuzy.androidlaunchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class IntentFlagTestWithAffinityActivity extends AppCompatActivity {
    private static final String TAG = "IntentFlagTestWithAffin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_flag_test_with_affinity);
        Log.e(TAG, "onCreate: " );
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "onNewIntent: " );
    }

    public void startMainActivity(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
