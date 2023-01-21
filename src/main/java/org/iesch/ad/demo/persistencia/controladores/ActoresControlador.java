package org.iesch.ad.demo.persistencia.controladores;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.servicios.ActorServicios;
import org.iesch.ad.demo.persistencia.servicios.PeliculasServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ActoresControlador {

    @Autowired
    PeliculasServicios peliculasServicios;
    @Autowired
    ActorServicios actoresServicios;

    @GetMapping("actores")
    public List<Actor> obtenerTodas(){
        return actoresServicios.buscaTodosLosActores();
    }

    @GetMapping("actores/{dni}")
    public Actor buscaActorPorDni(@PathVariable String dni){
        return actoresServicios.buscaActorPorDni(dni);
    }

    @PostMapping("añadirActor")
    public Actor insertarActor(@RequestBody @Validated Actor actor) {


        Actor actorTmp = actoresServicios.añadirActor(actor);
        return actorTmp;
    }

}
