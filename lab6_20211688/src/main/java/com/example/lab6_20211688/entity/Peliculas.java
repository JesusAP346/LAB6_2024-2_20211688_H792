package com.example.lab6_20211688.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="peliculas")
public class Peliculas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="peliculaId")
    private Integer peliculaId;
    @Column(name="titulo")
    private String titulo;

    @Column(name="fechaEstreno")
    private LocalDate fechaEstreno;

    @Column(name="duracionMinutos")
    private Integer duracionMinutos;


}
