package org.iesch.ad.demo.persistencia.servicios;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.modelos.Pelicula;
import org.iesch.ad.demo.persistencia.repositorio.ActorRepositorio;
import org.iesch.ad.demo.persistencia.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import javax.validation.Validator;


import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ActorServicios {
    @Autowired
    PeliculaRepositorio peliculaRepositorio;
    @Autowired
    ActorRepositorio actorRepositorio;


    @Autowired
    private Validator validator;

    public Actor añadirActor(Actor actor) {
        // Validate the actor object
        Set<ConstraintViolation<Actor>> violations = validator.validate(actor);
        if (!violations.isEmpty()) {
            // Throw an exception with the validation error message
            throw new ConstraintViolationException(violations);
        }
        // Save the actor to the database
        return actorRepositorio.save(actor);
    }
    public List<Actor> buscaTodosLosActores(){
        return actorRepositorio.findAll();
    }

    public Actor buscaActorPorDni(String dni){
        return Optional.of(actorRepositorio.findById(dni)).get().orElse(null);
    }
}
