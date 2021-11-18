package cl.twk.proyectos.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

	@GetMapping(value = "/index")
	public String index(Model model) {
		return "index";
	}
}