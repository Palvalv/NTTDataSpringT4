package com.nttdata.spring;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.service.ClienteServicioI;

/**
 * MainAPP.
 */
@SpringBootApplication
public class MainAPP implements CommandLineRunner{
	
	/** Servicio Cliente. */
	@Autowired
	ClienteServicioI service;
	
	/**
	 * Main.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainAPP.class, args);
	}
	
	/** Run. */
	@Override
	public void run(String... args) throws Exception {
		service.addClient("Yassine", "Bounou", "1313P", Date.valueOf(LocalDate.now()));
		service.addClient("Jesus", "Navas", "1616L", Date.valueOf(LocalDate.now()));
		service.addClient("Fernando", "Reges", "2525M", Date.valueOf(LocalDate.now()));
		service.addClient("Erik", "Lamela", "1111E", Date.valueOf(LocalDate.now()));
		service.addClient("Jorge", "Sampaoli", "1010E", Date.valueOf(LocalDate.now()));
	}
}
