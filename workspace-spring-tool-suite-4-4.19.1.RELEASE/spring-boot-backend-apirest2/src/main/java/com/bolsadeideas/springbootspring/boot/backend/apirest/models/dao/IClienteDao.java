package com.bolsadeideas.springbootspring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}