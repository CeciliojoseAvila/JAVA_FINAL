package com.bolsadeideas.springboot.di2.app.models.service;

//import org.springframework.stereotype.Component;

//@Primary
//@Component("miServicioSimple")

//@Primary
//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		return "Ejecutando algún proceso importante complejo...";
	}
	
}














