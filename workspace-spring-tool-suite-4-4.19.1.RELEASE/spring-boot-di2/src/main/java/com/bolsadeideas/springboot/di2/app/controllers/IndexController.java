package com.bolsadeideas.springboot.di2.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bolsadeideas.springboot.di2.app.models.service.IServicio;

@Controller
public class IndexController {
	//private IServicio servicio;	
	//private MiServicio servicio = new MiServicio();
	
	//@Autowired //lo movemos al setter
	//@Qualifier("miServicioComplejo")
	@Autowired
	private IServicio servicio;
	//private MiServicio servicio;
	
	/*@Autowired
	public IndexController(IServicio servicio) {
		super();
		this.servicio = servicio;
	}*/
	
	@GetMapping({"/", "", "/index"})
	public String index(Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
	
	
	
	
}













