package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class lifetracker extends AppCompatActivity {

    //import design elements
    EditText player1name;
    EditText player2name;
    FloatingActionButton p1add;
    FloatingActionButton p1minus;
    FloatingActionButton p2add;
    FloatingActionButton p2minus;
    TextView p1health;
    TextView p2Health;
    Button reset;

    Button home;

    //health
    protected int p1 =20;
    protected int p2=20;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.trackerlayout);

        //assign elements
        this.player1name=findViewById(R.id.p1name);
        this.player2name=findViewById(R.id.p2name);
        this.p1add=findViewById(R.id.p1add);
        this.p1minus=findViewById(R.id.p1minus);
        this.p2add=findViewById(R.id.p2add);
        this.p2minus=findViewById(R.id.p2minus);
        this.p1health=findViewById(R.id.p1health);
        this.p2Health=findViewById(R.id.p2health);
        this.reset = findViewById(R.id.btReset);
        this.home =findViewById(R.id.bthome);


        // Reset
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1=20;
                p2=20;
                p1display(p1);
                p2display(p2);
            }
        });

        //p2health-----------------------------------------------------
        p2minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2--;
                //p1health.setText(p1)
                p2display(p2);
            }
        });

        p2add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2++;
                //p1health.setText(p1)
                p2display(p2);
            }
        });

        //p1----------------------------- health
        p1minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1--;
                //p1health.setText(p1)
                p1display(p1);
            }
        });
        p1add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1++;
                p1display(p1);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lifetracker.this, homepage.class);
                startActivity(intent);

            }

        });

        }

    private void p2display(int n) {
        p2Health.setText(Integer.toString(n));
    }

    public void p1display(int n){
            p1health.setText(Integer.toString(n));
        }



}
