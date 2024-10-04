package com.example.lab6_20211688.repository;

import com.example.lab6_20211688.entity.PeliculasDirectores;
import com.example.lab6_20211688.entity.PeliculasDirectoresId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasDirectorsRepository extends JpaRepository<PeliculasDirectores, PeliculasDirectoresId> {
}
