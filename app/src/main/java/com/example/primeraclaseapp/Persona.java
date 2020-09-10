package com.example.primeraclaseapp;

public class Persona {
    private int CC;
    private String Nombre, Direccion;

    public Persona() {
    }

    public Persona(int CC, String nombre, String direccion) {
        this.CC = CC;
        Nombre = nombre;
        Direccion = direccion;
    }





    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

}
