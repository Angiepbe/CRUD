package com.example.primeraclaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Administrador Adm;
    private EditText ECC, ENombre, EDi,Eprof, EFe;


    ArrayList<Administrador> Lista = new ArrayList<Administrador>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ECC=(EditText)findViewById(R.id.ID_CC);
        ENombre=(EditText)findViewById(R.id.ID_Nombre);
        EDi=(EditText)findViewById(R.id.ID_Direccion);
        Eprof=(EditText)findViewById(R.id.ID_profesion);
        EFe=(EditText)findViewById(R.id.ID_Fecha);

    }

    public void Registrar (View view){

        int CC=Integer.parseInt(ECC.getText().toString());
        String nombre=ENombre.getText().toString();
        String dire=EDi.getText().toString();
        String profe=Eprof.getText().toString();
        int dia=Integer.parseInt(EFe.getText().toString());

        //public Administrador(int CC, String nombre, String direccion, String profesion, int Dias, int Mes, int Anio)

        Adm= new Administrador(CC,nombre,dire, profe,dia,0,0);//Llamar constructor
        if (Adm != null){
            Toast.makeText(this,"Registrado",Toast.LENGTH_SHORT).show();
            Lista.add(Adm);

        }
        Adm.getFechaIngreso().getDias();
        Adm.setFechaIngreso(12, 1,12);

    }

    //Funcion que va a llamar a la otra ventana

    public void Navegacion (View view ){
        Intent sig= new Intent(this,Segunda.class);//Generar instancia entre pantallar
        //Envio de info entre pantallas
        sig.putExtra("list",  Lista);//Generara un identificador que reconocera la siguiente pantalla
        startActivity(sig);//Inicializar objeto
    }

}