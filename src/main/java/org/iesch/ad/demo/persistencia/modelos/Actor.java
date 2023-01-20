package org.iesch.ad.demo.persistencia.modelos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "dni")
public class Actor {
    @Id
    @Column(length = 9)

    String dni;
    String nombre;
    LocalDate fechaNacimiento;
    @ManyToOne(fetch = FetchType.EAGER)
    Pelicula pelicula;

}
