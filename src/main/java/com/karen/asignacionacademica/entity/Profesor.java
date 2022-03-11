package com.karen.asignacionacademica.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @EqualsAndHashCode.Include
    @Column(unique = true,nullable = false)
    private String cedula;
    private String nombre;
    private String cargo;
    private Integer tope;
    private String observaciones;
    private Boolean estado;
}
