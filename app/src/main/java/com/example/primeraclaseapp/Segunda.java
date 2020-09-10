package com.example.primeraclaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Segunda extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tv=(TextView)findViewById(R.id.ID_Tex);

        ArrayList<Administrador> Lista=(ArrayList<Administrador>) getIntent().getSerializableExtra("Lista");//Tomar la información




    }

    public void  Anterior (View view ){
        Intent Ant= new Intent(this,MainActivity.class);
        startActivity(Ant);






    }




}