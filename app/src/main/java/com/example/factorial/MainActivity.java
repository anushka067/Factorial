package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button fact;
    EditText Num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fact = findViewById(R.id.button);
        Num = findViewById(R.id.textView);

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle= new Bundle();
                int usr, fact = 1, i;
                //String str = Num.getText().toString();
                usr = Integer.parseInt(Num.getText().toString());
                for (i = 1; i <= usr; i++) {
                    fact = fact * i;

                }
                bundle.putInt("message_key",fact);
                Intent intent = new Intent(MainActivity.this, MainActivitySec.class);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}