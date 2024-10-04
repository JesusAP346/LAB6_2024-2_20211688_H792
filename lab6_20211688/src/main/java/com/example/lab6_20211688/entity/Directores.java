package com.example.lab6_20211688.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="directores")
public class Directores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="directorId")
    private Integer directorId;
    @Column(name="nombre")
    private String nombre;
    @Column(name="telefono")
    private String telefono;
    @Column(name="nacionalidad")
    private String nacionalidad;
}
