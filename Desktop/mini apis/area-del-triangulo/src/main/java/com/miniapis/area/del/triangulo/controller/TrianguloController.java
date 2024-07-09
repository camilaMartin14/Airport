package com.miniapis.area.del.triangulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrianguloController {
    @GetMapping("/area-del-triangulo/base/{base}/altura/{altura}")
    public String mostrarArea(@PathVariable double base,
            @PathVariable double altura){
    double area = (base * altura)/2;
    return "El área del triángulo es de "+ area + "cm^2";
    }
}
