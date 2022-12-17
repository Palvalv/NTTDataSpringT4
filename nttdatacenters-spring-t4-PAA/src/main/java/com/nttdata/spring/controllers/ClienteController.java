package com.nttdata.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.nttdata.spring.models.Cliente;
import com.nttdata.spring.service.ClienteServicioI;

/**
 * Controlador cliente.
 */
@Controller
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	ClienteServicioI service;
	
	/**
	 * Exposicion de todos los clientes.
	 * @param model
	 * @return
	 */
	@RequestMapping("mostrarClientes")
	public String mostrarClientes(Model model) {
		model.addAttribute("clientes", service.findAll());
		return "mostrarClientes";
	}
	
	/**
	 * HTML con formulario para la inscripción de clientes.
	 * @return
	 */
	@RequestMapping("inscripcionClientes")
	public String addClientes() {
		return "inscripcionClientes";
	}
	
	/**
	 * HTML con formulario para las consultas. 
	 * @return
	 */
	@RequestMapping("consultarClientes")
	public String consultarClientes() {
		return "consultarClientes";
	}
	
	/**
	 * Inscribe al cliente y nos muestra la página inicial.
	 * @param newClient
	 * @return
	 */
	@PostMapping("/inscripcionClientes")
	public String addClient(@ModelAttribute("cliente") Cliente newClient) {
		service.addClient(newClient);
		return "inicio";
	}
	
	/**
	 * Exposicion clientes por nombre y apellidos.
	 * @param model
	 * @param nombre
	 * @param apellidos
	 * @return
	 */
	@RequestMapping("/consultarClientes")
	public String filtraClientes(Model model, @RequestParam String nombre, @RequestParam String apellidos) {
		
		model.addAttribute("clientesEncontrados", service.buscaNombreApellidos(nombre, apellidos));
		return "consultarClientes";
	}
}
