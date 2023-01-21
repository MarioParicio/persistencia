package org.iesch.ad.demo.persistencia.modelos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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
    @NotBlank(message = "DNI is mandatory")
    @Size(min = 9, max = 9, message = "DNI must be 9 characters long")
    String dni;
    @NotBlank(message = "name is mandatory")
    String nombre;
    LocalDate fechaNacimiento;
    @ManyToOne(fetch = FetchType.EAGER)
    Pelicula pelicula;

}
