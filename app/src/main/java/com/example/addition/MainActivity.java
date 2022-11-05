package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText number1, number2;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        number1 = findViewById(R.id.number1);
        number2 =  findViewById(R.id.number2);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added with Love <3 :)", Toast.LENGTH_SHORT).show();
                int sum = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
                textView.setText(sum);
            }
        });

    }

    /*public void Add(View view){
        Toast.makeText(this, "Added with Love <3 :)", Toast.LENGTH_SHORT).show();
        /*String A = number1.getText().toString();
        int a = Integer.parseInt(A);
        String B = number2.getText().toString();
        int b = Integer.parseInt(B);
        int c = a + b;
        textView.setText(c);
        int sum = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
        textView.setText(sum);

    }*/
}