package com.project.soundrift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS);
        startActivityForResult(intent, 0);
        startUrlInterceptorService();
    }

    private void startUrlInterceptorService() {
        Intent intent = new Intent(this.getApplicationContext(), UrlInterceptorService.class);
        startService(intent);
    }
}