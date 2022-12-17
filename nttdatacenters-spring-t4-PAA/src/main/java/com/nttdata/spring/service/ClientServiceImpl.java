package com.nttdata.spring.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.spring.models.Cliente;
import com.nttdata.spring.repository.RepositorioClientes;

/**
 * Implementacion de Servicio para clientes.
 */
@Service("ClienteServicio")
@Primary
public class ClientServiceImpl implements ClienteServicioI {
	
	/** Respositorio */
	@Autowired
	RepositorioClientes repositorio;
	
	@Override
	public List<Cliente> findAll() {
		return repositorio.findAll();
	}
	
	@Override
	public void addClient(Cliente cliente) {
		repositorio.save(cliente);
	}

	@Override
	public void addClient(String nombre, String apellidos, String dni, Date fechaNacimiento) {
		Cliente newClient = new Cliente();
		newClient.setNombre(nombre);
		newClient.setApellidos(apellidos);
		newClient.setDni(dni);
		newClient.setFechaNacimiento(fechaNacimiento);
		repositorio.save(newClient);
	}

	@Override
	public List<Cliente> buscaNombreApellidos2(String nombre, String apellidos) {
		return repositorio.buscaNombreApellidos(nombre, apellidos);
	}

	@Override
	public List<Cliente> buscaNombreApellidos(String nombre, String apellidos) {
		return null;
	}
}
