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
    private TextView tv;
    private EditText cedula;

    Administrador Adm;
    List<Administrador> Lista=new ArrayList<Administrador>();
    private TextView ECC, ENombre, EDi,Eprof, EFe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tv=(TextView)findViewById(R.id.ID_Tex);
        Intent miIntetnt =getIntent();

        Lista= (ArrayList<Administrador>)getIntent().getSerializableExtra("list");//Tomar la información
        cedula=(EditText)findViewById(R.id.ID_BUS);

        ECC=(TextView) findViewById(R.id.ID_Tex);
        ENombre=(TextView)findViewById(R.id.ID_TEXN);
        EDi=(TextView)findViewById(R.id.ID_TEXD);
        Eprof=(TextView)findViewById(R.id.ID_TEXTP);
        EFe=(TextView)findViewById(R.id.ID_TEXF);
    }

    public void  Anterior (View view ){
        Intent Ant= new Intent(this,MainActivity.class);
        startActivity(Ant);


    }


    public  void  buscarCC(View view){

        int CC=Integer.parseInt(cedula.getText().toString());
         int indice;
        for (int i=0;i>=Lista.size();i++){

            if(Lista.get(i).getCC()==CC){
                indice=i;
                ECC.setText(Lista.get(indice).getCC());
                ENombre.setText(Lista.get(indice).getNombre());
                EDi.setText(Lista.get(indice).getDireccion());
                Eprof.setText(Lista.get(indice).getProfesion());
                EFe.setText(Lista.get(indice).getFechaIngreso().getAnio()+" "+Lista.get(indice).getFechaIngreso().getMes()+" "+Lista.get(indice).getFechaIngreso().getDias());

            }else {

                Toast.makeText(this,"NO se ha enconrado",Toast.LENGTH_SHORT).show();

            }
        }


    }



}