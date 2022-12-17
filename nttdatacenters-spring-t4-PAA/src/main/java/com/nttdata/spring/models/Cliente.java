package com.nttdata.spring.models;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * Tabla de clientes.
 */
@Entity
@Table(name = "C_Client")
public class Cliente implements Serializable{
	
	/** Parametros */
	
	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/** ID */
	private Integer id;
	
	/** Nombre */
	private String nombre;
	
	/** Apellido */
	private String apellidos;
	
	/** Fecha de nacimiento */
	private Date fechaNacimiento;
	
	/** DNI */
	private String dni;
	
	/** Getters & Setters */
	
	/**
	 * @return id
	 */
	@Id
	@Column(name="C_CLIENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqClientID")
	@SequenceGenerator(name = "seqClientID", sequenceName = "SEQ_T_CLIENT")
	public Integer getId() {
		return id;
	}

	/**
	 * @param id para set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return nombre
	 */
	@Column(name = "C_CLIENT_NAME")
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre para set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellidos
	 */
	@Column(name = "C_CLIENT_APELLIDOS")
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos para set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return fechaNacimiento
	 */
	@Column(name = "C_CLIENT_FECHA_NACIMIENTO")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento para set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return DNI
	 */
	@Column(name = "C_CLIENT_DNI")
	public String getDni() {
		return dni;
	}

	/**
	 * @param DNI para set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Metodo toString.
	 */
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaDeNacimiento="
				+ fechaNacimiento + ", dni=" + dni + "]";
	}
	
	
	
	
}
