package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivitySec extends AppCompatActivity {
    TextView ReceivedNum;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsec);

        ReceivedNum = findViewById(R.id.editTextTextPersonName2);

        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        int val = bundle.getInt("message_key");
        //String fact = intent.getStringExtra("message_key");
        String str = String.valueOf(val);
        ReceivedNum.setText(str);

    }
}