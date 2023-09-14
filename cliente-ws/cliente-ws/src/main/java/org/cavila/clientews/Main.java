package org.cavila.clientews;

import org.cavila.webapp.jaxws.services.Curso;
import org.cavila.webapp.jaxws.services.ServicioWs;
import org.cavila.webapp.jaxws.services.ServicioWsImplService;

public class Main {
    public static void main(String[] args) {
        ServicioWs service = new ServicioWsImplService().getServicioWsImplPort();
        System.out.println("el saludo: " + service.saludar("CECILIO"));

        Curso curso = new Curso();
        curso.setNombre("Angular");
        Curso respuesta = service.crear(curso);
        System.out.println("Nuevo curso: " + curso.getNombre());

        service.listar().forEach(c -> System.out.println(c.getNombre()));
    }
}








