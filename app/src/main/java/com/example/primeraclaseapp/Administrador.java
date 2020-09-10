package com.example.primeraclaseapp;

public class Administrador extends Persona {
    private String Profesion;
    private Fecha FechaIngreso;

    public Administrador() {
        this.FechaIngreso = new Fecha();//Reservar espacio de memoria

    }

    public Administrador(String profesion, int Dias, int Mes, int Anio) {
        Profesion = profesion;
        FechaIngreso = new Fecha(Dias,Mes,Anio);
    }

    public Administrador(int CC, String nombre, String direccion, String profesion, int Dias, int Mes, int Anio) {
        super(CC, nombre, direccion);
        Profesion = profesion;
        FechaIngreso = new Fecha(Dias,Mes,Anio);
    }

    public String getProfesion() {
        return Profesion;
    }

    public Fecha getFechaIngreso() {
        return FechaIngreso;
    }

    public void setProfesion(String profesion) {
        Profesion = profesion;
    }

    public void setFechaIngreso(int Dias, int Mes, int Anio) {

        FechaIngreso.setDias(Dias);
        FechaIngreso.setMes(Mes);
        FechaIngreso.setAnio(Anio);
    }
}
