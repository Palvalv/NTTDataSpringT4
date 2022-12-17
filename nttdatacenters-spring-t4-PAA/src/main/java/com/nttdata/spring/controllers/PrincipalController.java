package com.nttdata.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador principal.
 */
@Controller
@RequestMapping("/*")
public class PrincipalController {
	@RequestMapping("principal")
	
	public String principal() {
		return "inicio";
	}
}
