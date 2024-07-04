package com.ejerciciosspringboot.restaurante.controller;

import com.ejerciciosspringboot.restaurante.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestauranteController {
    @GetMapping("/platos/{num_plato}")
    @ResponseBody
    public Plato traerPlatos(@PathVariable int num_plato){
    
        List <Plato> listaPlatos = new ArrayList <Plato>();
        
        listaPlatos.add(new Plato (1, "Milanesas con Puré",5000.00,"Milanesa de carne o pollo simple, sin napolitana con puré de papas"));
        listaPlatos.add(new Plato (2, "Parrilla para dos personas",11000.00,"Tira de asado para compartir con guarnición a elección"));
        listaPlatos.add(new Plato (3, "Ravioles con salsa",5000.00,"Ravioles de carne y verdura con salsa a elección (blanca, roja, mixta)"));
        listaPlatos.add(new Plato (4, "Estofado",5000.00,"Estofado de papa, zanahoria, carne y tomate"));
        listaPlatos.add(new Plato (5, "Menú infantil",2500.00,"Hamburguesa chica con queso y papas o patitas de pollo"));
        
            for (Plato plat:listaPlatos){
                if (plat.getId() == num_plato) {
                    return plat;
                }
            }
        
        //Si no encuentra el plato, devuelve nulo
        return null;
    }
}
