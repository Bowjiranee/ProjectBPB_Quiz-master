package com.example.hp.projectbpb_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        Button bloodBut = (Button)findViewById(R.id.blood_button);
        Button zodiacBut = (Button)findViewById(R.id.zodiac_button);
        Button fruitBut = (Button)findViewById(R.id.fruit_button);
        Button backBut = (Button)findViewById(R.id.back_button);

        bloodBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select.this,MainActivity.class);
                startActivity(intent);
            }
        });

        zodiacBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select.this,Main2Activity.class);
                startActivity(intent);
            }
        });


        fruitBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select.this,Main3Activity.class);
                startActivity(intent);
            }
        });

        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
