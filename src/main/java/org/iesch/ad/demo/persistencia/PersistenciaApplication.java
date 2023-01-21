package org.iesch.ad.demo.persistencia;

import org.iesch.ad.demo.persistencia.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PersistenciaApplication {

	public static void main(String[] args) {

		SpringApplication.run(PersistenciaApplication.class, args);

	}

}
