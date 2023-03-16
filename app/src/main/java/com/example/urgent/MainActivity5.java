package com.example.urgent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {

    public CardView cc2,cc3,cc4,cc5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        cc2 = findViewById(R.id.card_health);
        cc3 = findViewById(R.id.card_acc);
        cc4 = findViewById(R.id.card_wom);
        cc5 = findViewById(R.id.card_fire);

        cc2.setOnClickListener(this);
        cc3.setOnClickListener(this);
        cc4.setOnClickListener(this);
        cc5.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId())
        {

            case R.id.card_health:
                i=new Intent(this,MainActivity7.class);
                startActivity(i);
                break;

            case R.id.card_acc:
                i=new Intent(this,MainActivity8.class);
                startActivity(i);
                break;

            case R.id.card_wom:
                i=new Intent(this,MainActivity9.class);
                startActivity(i);
                break;

            case R.id.card_fire:
                i=new Intent(this,MainActivity10.class);
                startActivity(i);
                break;
        }
    }
}