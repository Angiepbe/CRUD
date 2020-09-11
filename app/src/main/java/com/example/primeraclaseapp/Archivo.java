package com.example.primeraclaseapp;


import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {


    ArrayList<Administrador> UserList;
    File file;
    public Archivo(String name){
        UserList = new ArrayList<Administrador>();
        file = new File(name+".txt");

        if(!file.exists()){
            try {
                ///   file.getParentFile().mkdirs();
                file.createNewFile();


            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if(file.length() !=0){
            loadFile(file);
        }
    }


    public void addUser(Administrador usuario){
        UserList.add(usuario);
        saveFile(this.file);
    }

    public void saveFile(File file){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream writer = new ObjectOutputStream(fos);
            writer.writeObject(UserList);
            writer.close();
            fos.close();
        } catch(FileNotFoundException ex){System.out.println("FileNotFoundException amigo");}
        catch(IOException ex){System.out.println("InputException");}
    }

    public void loadFile(File file){
        try{

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream reader = new ObjectInputStream(fis);
            UserList=(ArrayList<Administrador>)reader.readObject();
            reader.close();
            fis.close();
        } catch(FileNotFoundException ex){ System.out.println("FileNotFoundException"); }
        catch(IOException ex){System.out.println("OutputException");}
        catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");}

    }

    public int buscarUsuario(int CC){


        for(int i=0;i<UserList.size();i++){

            if(UserList.get(i).getCC()==CC){
                return i;
            }
        }
        return -1;

    }

}
