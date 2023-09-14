package org.cavila.webapp.jsf3.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.cavila.webapp.jsf3.entities.Producto;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Model
public class ProductoController {
    //@Inject
    //private ProductoService service;

    @Produces
    @Model
    public String titulo() {
        return "Hola mundo JavaServer Face 3.0";
    }

   @Produces
    @RequestScoped
    @Named("listado")
    public List<Producto> findAll() {
        return Arrays.asList(new Producto("Peras"), new Producto("Manzanas"), new Producto("Mandarinas") );
    }
}