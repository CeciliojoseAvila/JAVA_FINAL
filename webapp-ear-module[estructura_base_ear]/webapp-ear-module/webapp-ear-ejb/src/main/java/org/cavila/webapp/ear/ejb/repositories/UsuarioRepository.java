package org.cavila.webapp.ear.ejb.repositories;
import org.cavila.webapp.ear.ejb.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {
    List<Usuario> listar();
}
