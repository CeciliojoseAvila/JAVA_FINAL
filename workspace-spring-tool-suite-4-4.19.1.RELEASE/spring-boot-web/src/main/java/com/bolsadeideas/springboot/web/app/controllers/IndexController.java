package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.appmodels.Usuario;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexController.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexController.perfil.titulo}")
	private String textoPerfil;
	
	@Value("${texto.indexController.listar.titulo}")
	private String textoListar;
	
	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		
		model.addAttribute("titulo", textoIndex);
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("CECILIO");
		usuario.setApellido("AVILA");
		usuario.setEmail("ceciliojose@gmail.com");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = Arrays.asList(new Usuario("CECILIO","AVILA", "ceciliojose@gmail.com"),
				new Usuario("Andrés","Guzman", "andresg@gmail.com"),
				new Usuario("Jane","Doe", "janed@gmail.com"),
				new Usuario("Tornado","Roe", "tornador@gmail.com"));
		
		//usuarios.add(new Usuario("CECILIO","AVILA", "ceciliojose@gmail.com"));
		//usuarios.add(new Usuario("Andrés","Guzman", "andresg@gmail.com"));
		//usuarios.add(new Usuario("Jane","Doe", "janed@gmail.com"));
		
		model.addAttribute("titulo", textoListar);
	//	model.addAttribute("usuarios",usuarios ); //suprimimos porque agregamos el @ModelAttribute
		
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("CECILIO","AVILA", "ceciliojose@gmail.com"),
				new Usuario("Andrés","Guzman", "andresg@gmail.com"),
				new Usuario("Jane","Doe", "janed@gmail.com"),
				new Usuario("Tornado","Roe", "tornador@gmail.com"));
		
		return usuarios;
	}

}












