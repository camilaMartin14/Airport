package com.miniapis.promedioDeNotas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromedioController {
    @GetMapping("promedio")
    public String mostrarPromedio(@RequestParam int nota1,
                                    @RequestParam int nota2,
                                    @RequestParam int nota3){
        
        double promedio = (nota1 + nota2 + nota3)/3;
    
        return "Hola, tu promedio es de " + promedio;
        //URL: localhost:8080/promedio?nota1=XXXXX&nota2=XXXXX&nota3=XXXXX
    }
}
