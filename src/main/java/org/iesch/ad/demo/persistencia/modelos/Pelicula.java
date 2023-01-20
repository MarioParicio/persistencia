package org.iesch.ad.demo.persistencia.modelos;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "titulo")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titulo;
    LocalDate year;
    String genero;
    String urlFoto;
    String director;
    String sinopsis;
    int duracion;
    int puntunacion;
    @OneToMany(mappedBy = "pelicula", fetch = FetchType.LAZY)

    List<Actor> actores;






}
