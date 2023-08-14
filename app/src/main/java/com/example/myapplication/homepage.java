package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class homepage extends AppCompatActivity {
    Button gametrack;
    Button coffers;
    Button turns;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homelay);
        this.gametrack=findViewById(R.id.trackbtn);
        this.coffers=findViewById(R.id.cofbtn);
        this.turns=findViewById(R.id.turnsbtn);

        //-------------------make buttons do things -
        gametrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homepage.this,lifetracker.class);
                startActivity(i);

            }
        });
        coffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, coffers.class);
                startActivity(intent);

            }

        });

        turns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, manufacturer.class);
                startActivity(intent);

            }

        });

    }
}
