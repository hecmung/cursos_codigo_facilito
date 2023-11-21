package com.codigofacilito.ejemplos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index (Model model) {
		model.addAttribute("tittle", "Soy el titulo");
		model.addAttribute("hello", "Hola");
		model.addAttribute("show", false);
		
		//List<String> series = List.of("Serie 1", "Serie 2", "Serie 3");
//		model.addAttribute("series", series);
		
		return "index";
	}
	
	@GetMapping("/index-mv")
	public ModelAndView indexMV(ModelAndView mv) {
		mv.addObject("tittle", "Titulo mv");
		mv.addObject("hello", "Hola mv");
		mv.addObject("show", true);
		
		//List<String> series = List.of("Serie mv 1", "Serie mv 2", "Serie mv 3");
//		mv.addObject("series", series);
		
		mv.setViewName("index");
		return mv;
	}
	
	@ModelAttribute("series")
	public List<String> getSeries() {
		return List.of("Serie 1", "Serie 2", "Serie 3", "Serie 4", "Serie 5");
	}
	
	@RequestMapping(value = "/index-req-mapping", method = RequestMethod.GET)
	public String indexRequestMapping() {
		return "index";
	}
}
