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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homelay);
        this.gametrack=findViewById(R.id.trackbtn);
        this.coffers=findViewById(R.id.cofbtn);

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
                Intent i = new Intent(homepage.this, coffers.class);
                startActivity(i);

            }

        });

    }
}
