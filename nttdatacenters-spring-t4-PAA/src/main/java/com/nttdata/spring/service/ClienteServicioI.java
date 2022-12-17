package com.nttdata.spring.service;

import java.sql.Date;
import java.util.List;
import com.nttdata.spring.models.Cliente;

/**
 * Interfaz de Servicio para clientes. 
 */
public interface ClienteServicioI {
	
	/**
	 * Filtra clientes por nombre y apellidos.
	 * @param nombre
	 * @param apellidos
	 * @return
	 */
	public List<Cliente> buscaNombreApellidos(String nombre, String apellidos);
	
	/**
	 * Inscipcion de clientes.
	 * @param cliente
	 */
	public void addClient(Cliente cliente);
	
	/**
	 * Lista de los clientes.
	 * @return
	 */
	public List<Cliente> findAll();
	
	/**
	 * Inscripcion de clientes.
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param fechaNacimiento
	 */
	public void addClient(String nombre, String apellidos, String dni, Date fechaNacimiento);

	List<Cliente> buscaNombreApellidos2(String nombre, String apellidos);
}
