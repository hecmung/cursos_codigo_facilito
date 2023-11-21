package com.codigofacilito.ejemplos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParameterController {

	@GetMapping("/parameters")
	public String parameters(@RequestParam(defaultValue = "Valor default") String s, Model model) {
		
		model.addAttribute("tittle", "Titulo de parametros");
		model.addAttribute("value", s);
		return "parameter";
	}
}
