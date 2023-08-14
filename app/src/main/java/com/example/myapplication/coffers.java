package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class coffers extends AppCompatActivity {

    FloatingActionButton cadd;
    FloatingActionButton cminus;
    TextView coffers;
    TextView swamps;
    TextView mana;

    FloatingActionButton sadd;
    FloatingActionButton sminus;

    int numSwamp =0;
    int numCoff=0;
    int totMana = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cofferslayout);

        //implement design
        this.sadd=findViewById(R.id.madd);
        this.sminus=findViewById(R.id.sminus);
        this.cadd=findViewById(R.id.tminus);
        this.cminus=findViewById(R.id.cminus);
        this.coffers=findViewById(R.id.coffers);
        this.swamps=findViewById(R.id.manu);
        this.mana=findViewById(R.id.clue);


        ////swamps buttons
        sadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSwamp++;
                swamps.setText(Integer.toString(numSwamp));
                calculate();

            }
        });
        sminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numSwamp--;
                swamps.setText(Integer.toString(numSwamp));
                calculate();

            }
        });

        //coffers buttons
        cadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numCoff++;
                coffers.setText(Integer.toString(numCoff));
                calculate();

            }
        });

        cminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numCoff--;
                coffers.setText(Integer.toString(numCoff));
                calculate();

            }
        });

    }
    private void calculate(){
        totMana = ((1+numCoff)*numSwamp)-(3*numCoff);
        mana.setText(Integer.toString(totMana));
    }
}
