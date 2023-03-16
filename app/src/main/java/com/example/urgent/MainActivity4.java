package com.example.urgent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    public CardView c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);

        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId())
        {

            case R.id.c2:
                i=new Intent(this,MainActivity.class);
                startActivity(i);
                break;

            case R.id.c3:
                i=new Intent(this,MainActivity3.class);
                startActivity(i);
                break;

            case R.id.c4:
                i=new Intent(this,MainActivity5.class);
                startActivity(i);
                break;

            case R.id.c5:
                i=new Intent(this,MainActivity6.class);
                startActivity(i);
                break;
        }
}
}