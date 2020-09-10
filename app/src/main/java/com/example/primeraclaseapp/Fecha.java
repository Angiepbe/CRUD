package com.example.primeraclaseapp;

public class Fecha {
    private int Dias, Mes, Anio;

    public Fecha() {
    }

    public Fecha(int dias, int mes, int anio) {
        Dias = dias;
        Mes = mes;
        Anio = anio;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int dias) {
        Dias = dias;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }
}
