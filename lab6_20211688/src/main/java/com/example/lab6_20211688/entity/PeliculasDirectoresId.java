package com.example.lab6_20211688.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class PeliculasDirectoresId implements Serializable {

    @Column(name="peliculaid",nullable=false)
    private Integer peliculaid;

    @Column(name="directorid",nullable=false)
    private Integer directorid;


}
