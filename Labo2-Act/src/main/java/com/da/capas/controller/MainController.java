package com.da.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.da.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/agregarUsuario")
		public String enviarForm(Usuario usuario) {
			return "agregarUsuario";
	}
	
	@PostMapping("/agregarUsuario")
	public String procesarForm(Usuario usuario) {
		return "mostrarMensaje";
}

}
