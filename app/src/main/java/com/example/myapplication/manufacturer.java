package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class manufacturer extends AppCompatActivity {

    FloatingActionButton madd;
    FloatingActionButton mminus;

    TextView manu;
    TextView token;
    TextView food;
    TextView treasure;
    TextView clue;

    FloatingActionButton tadd;
    FloatingActionButton tminus;

    Button home;

    int nummanu =0;
    int numtoken=0;
    int tottok = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dimirturns);

        //implement design features
        this.manu=findViewById(R.id.manu);
        this.token=findViewById(R.id.tokens);
        this.food=findViewById(R.id.food);
        this.treasure=findViewById(R.id.treasure);
        this.clue=findViewById(R.id.clue);
        this.madd=findViewById(R.id.madd);
        this.mminus=findViewById(R.id.sminus);
        this.tadd=findViewById(R.id.tadd);
        this.tminus=findViewById(R.id.tminus);
        this.home=findViewById(R.id.bthome_man);


        //buttons
        madd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nummanu++;
                manu.setText(Integer.toString(nummanu));
                calculate();

            }
        });
        mminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nummanu--;
                manu.setText(Integer.toString(nummanu));
                calculate();

            }
        });

        //coffers buttons
        tadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numtoken++;
                token.setText(Integer.toString(numtoken));
                calculate();

            }
        });

        tminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numtoken--;
                token.setText(Integer.toString(numtoken));
                calculate();

            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manufacturer.this, homepage.class);
                startActivity(intent);

            }

        });
    }
    private void calculate(){
        //int i = (nummanu-1)*numtoken;
        //tottok = (int) Math.pow(3,i);
        tottok = (int) (Math.pow(3,nummanu) * numtoken)/3;
        food.setText(Integer.toString(tottok));
        treasure.setText(Integer.toString(tottok));
        clue.setText(Integer.toString(tottok));
    }
}
