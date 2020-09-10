package com.example.primeraclaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tv=(TextView)findViewById(R.id.ID_Tex);

        String dato=getIntent().getStringExtra("info");//Tomar la información
        tv.setText(dato);
    }

    public void  Anterior (View view ){
        Intent Ant= new Intent(this,MainActivity.class);
        startActivity(Ant);


    }
}