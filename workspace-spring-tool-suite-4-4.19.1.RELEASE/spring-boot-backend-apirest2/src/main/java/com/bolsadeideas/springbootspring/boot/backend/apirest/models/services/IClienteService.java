package com.bolsadeideas.springbootspring.boot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
}