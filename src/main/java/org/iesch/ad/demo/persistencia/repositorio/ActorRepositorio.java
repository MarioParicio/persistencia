package org.iesch.ad.demo.persistencia.repositorio;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.modelos.Pelicula;
import org.iesch.ad.demo.persistencia.servicios.ActorServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActorRepositorio extends JpaRepository<Actor, String> {


}