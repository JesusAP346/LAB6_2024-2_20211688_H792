package com.example.lab6_20211688.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="peliculas_directores")
public class PeliculasDirectores {
    @EmbeddedId
    private PeliculasDirectoresId id;


    @MapsId("peliculaid")
    @ManyToOne
    @JoinColumn(name="peliculaid")
    private Peliculas peliculaId;


    @MapsId("directorid")
    @ManyToOne
    @JoinColumn(name="directorid")
    private Directores directorId;

}
