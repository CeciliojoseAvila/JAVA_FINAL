package org.cavila.clientews;

import org.cavila.webapp.jaxws.services.Curso;
import org.cavila.webapp.jaxws.services.CursoServicioWs;
import org.cavila.webapp.jaxws.services.CursoServicioWsImplService;

public class Main {
    public static void main(String[] args) {
        CursoServicioWs service = new CursoServicioWsImplService().getCursoServicioWsImplPort();

        Curso curso = new Curso();
        curso.setNombre("React");
        curso.setDescripcion("React js");
        curso.setDuracion(50D);
        curso.setInstructor("CECILIO AVILA");
        Curso respuesta = service.guardar(curso);
        System.out.println("Nuevo curso: " + curso.getId() +", "+ curso.getNombre());

        service.listar().forEach(c -> System.out.println(c.getNombre()));
    }
}








