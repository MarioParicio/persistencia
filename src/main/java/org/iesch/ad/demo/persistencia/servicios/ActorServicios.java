package org.iesch.ad.demo.persistencia.servicios;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.modelos.Pelicula;
import org.iesch.ad.demo.persistencia.repositorio.ActorRepositorio;
import org.iesch.ad.demo.persistencia.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ActorServicios {
    @Autowired
    PeliculaRepositorio peliculaRepositorio;
    @Autowired
    ActorRepositorio actorRepositorio;



    public Actor añadirActor(Actor actor){

        return actorRepositorio.save(actor);

    }
    public List<Actor> buscaTodosLosActores(){
        return actorRepositorio.findAll();
    }

    public Actor buscaActorPorDni(String dni){
        return Optional.of(actorRepositorio.findById(dni)).get().orElse(null);
    }
}
