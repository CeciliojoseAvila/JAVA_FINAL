package org.cavila.webapp.jsf3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


public class Producto {
    private String nombre;

    public Producto() {
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}












