package com.example.lab6_20211688;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inicioController {
    @GetMapping("inicio")
    public String irInicio(){
        return "inicio";
    }
}
