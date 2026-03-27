package com.example.glowupapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Second Screen");
        textView.setTextSize(24);
        textView.setPadding(40, 100, 40, 40);

        setContentView(textView);
    }
}