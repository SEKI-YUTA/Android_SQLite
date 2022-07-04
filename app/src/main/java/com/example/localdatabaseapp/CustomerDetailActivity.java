package com.example.localdatabaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CustomerDetailActivity extends AppCompatActivity {
    TextView tv_customerName, tv_customerAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_detail);

        Intent intent = getIntent();

        tv_customerName = findViewById(R.id.tv_customerName);
        tv_customerAge = findViewById(R.id.tv_customerAge);

        tv_customerName.setText(intent.getStringExtra("name"));
        tv_customerAge.setText(intent.getStringExtra("age"));

    }
}