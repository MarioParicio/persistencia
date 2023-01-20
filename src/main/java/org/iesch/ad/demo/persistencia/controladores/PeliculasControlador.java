package org.iesch.ad.demo.persistencia.controladores;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.modelos.Pelicula;
import org.iesch.ad.demo.persistencia.servicios.PeliculasServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PeliculasControlador {

    @Autowired
    PeliculasServicios peliculasServicios;

    @GetMapping("peliculas")
    public List<Pelicula> obtenerTodas(){
        return peliculasServicios.buscaTodasLasPeliculas();
    }

    @GetMapping("peliculas/{dni}")
    public Pelicula buscaActorPorDni(@PathVariable Long id){
        return peliculasServicios.buscaPeliculaPorId(id);
    }

    @PostMapping("añadirPelicula")
    public Pelicula insertarPelicula(@RequestBody Pelicula pelicula){
        Pelicula peliculaTmp = peliculasServicios.añadirPelicula(pelicula);
        return peliculaTmp;
    }

}
