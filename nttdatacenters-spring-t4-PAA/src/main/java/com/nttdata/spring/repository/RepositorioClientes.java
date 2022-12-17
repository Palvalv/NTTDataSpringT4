package com.nttdata.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.spring.models.Cliente;

/**
 * Repositorio de clientes.
 */
@Repository
public interface RepositorioClientes extends JpaRepository<Cliente, Integer>{
	/**
	 * Filtra cliente por nombre y apellidos.
	 * @param nombre
	 * @param apellidos
	 * @return
	 */
	public List<Cliente> buscaNombreApellidos(String nombre, String apellidos);
}
