package com.example.primeraclaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Segunda extends AppCompatActivity {
    private TextView tv;
    private EditText cedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tv=(TextView)findViewById(R.id.ID_Tex);


        ArrayList<Administrador> Lista=(ArrayList<Administrador>) getIntent().getSerializableExtra("Lista");//Tomar la información





        String dato=getIntent().getStringExtra("info");//Tomar la información
        tv.setText(dato);

    }

    public void  Anterior (View view ){
        Intent Ant= new Intent(this,MainActivity.class);
        startActivity(Ant);


    }


    public  void  buscarCC(View view){
        Archivo fichero2 = new Archivo("Registro");
        int CC=Integer.parseInt(cedula.getText().toString());
         int indice=fichero2.buscarUsuario(CC);
        if (indice != -1) {



        }else {
            Toast.makeText(this,"NO se ha enconrado",Toast.LENGTH_SHORT).show();

        }






    }



}