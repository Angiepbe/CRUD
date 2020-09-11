package com.example.primeraclaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Segunda extends AppCompatActivity {


    private EditText cedula;
    private EditText name;
    private EditText dir;
    private EditText profe;
    private TextView id;
    private EditText fecha;
    int indice;
    ArrayList<Administrador> Lista;
  // Archivo fichero2 = new Archivo("Registro");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        int indice=0;


        ArrayList<Administrador> listaAd=(ArrayList<Administrador>) getIntent().getSerializableExtra("info");
        Lista=listaAd;
        cedula=(EditText) findViewById(R.id.ID_BUS);
        name=(EditText) findViewById(R.id.ID_TEXN);
        dir=(EditText) findViewById(R.id.ID_TEXD);
        profe=(EditText) findViewById(R.id.ID_TEXP);
        fecha=(EditText) findViewById(R.id.ID_TEXF);
        id=(TextView) findViewById(R.id.ID_Tex);


    }




    public void  Anterior (View view ){

        Intent Ant= new Intent(Segunda.this,MainActivity.class);
        Ant.putExtra("info",Lista);//Generara un identificador que reconocera la siguiente pantalla
        startActivity(Ant);

    }



    public  void  buscarCC(View view){

     //   ArrayList<Administrador> listaAd=(ArrayList<Administrador>) getIntent().getSerializableExtra("info");


        int CC=Integer.parseInt(cedula.getText().toString());
        boolean entro=false;



        for (int i=0;i<Lista.size();i++){



            if(Lista.get(i).getCC()==CC){

                Toast.makeText(this,Lista.get(i).getNombre(),Toast.LENGTH_SHORT).show();
                id.setText(Integer.toString(Lista.get(i).getCC()));
                name.setText(Lista.get(i).getNombre());
                profe.setText(Lista.get(i).getProfesion());
                dir.setText(Lista.get(i).getDireccion());
                fecha.setText(Lista.get(i).getFechaIngreso());
                entro=true;
                indice=i;

            }


        }

        if(entro){
            Toast.makeText(this,"no llegó ni mierda",Toast.LENGTH_SHORT).show();
        }


    }

    public void modificar(View view){


    }








}