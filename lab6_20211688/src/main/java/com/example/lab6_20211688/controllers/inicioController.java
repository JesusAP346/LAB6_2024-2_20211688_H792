package com.example.lab6_20211688.controllers;

import com.example.lab6_20211688.entity.Peliculas;
import com.example.lab6_20211688.repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class inicioController {
    @Autowired
    PeliculasRepository peliculasRepository;




    @GetMapping({"/inicio","/",""})
    public String irInicio(){
        return "inicio";
    }
    @GetMapping("directores")
    public String directores(){

        return "directores";
    }
    @GetMapping("contacto")
    public String contacto(){
        return "contacto";
    }

    @GetMapping("crearPelicula")
    public String crearPeli(){
        return "crearPelicula";
    }

    @PostMapping("crearPeliculaPost")
    public String crearPeliPost(Peliculas peliculas){
        System.out.println(peliculas.getTitulo());
        System.out.println(peliculas.getFechaEstreno());
        System.out.println(peliculas.getDuracionMinutos());

        peliculasRepository.save(peliculas);

        return "redirect:/peliculas";
    }


    @GetMapping("/peliculas")
    public String peliculas(Model model){
        List<Peliculas> listaPeliculas = peliculasRepository.findAll();
        model.addAttribute("listaPeliculas", listaPeliculas);

        return "peliculas";
    }
}
