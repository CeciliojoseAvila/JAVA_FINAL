package com.bolsadeideas.springboot.di2.app.models.service;
import org.springframework.stereotype.Component;

import org.springframework.context.annotation.Primary;


//@Component("miServicioSimple")
// implements IServicio

//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		return "Ejecutando algún proceso importante simple...";
	}
	
}














