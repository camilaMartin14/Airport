package com.tp_integrador_1.TP_Integrador_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IntegradorController {
    
    @GetMapping ("/convertir/{galones}")
    public String galonesALitros(@PathVariable double galones){
    
        //convertimos los galones a litros
        double litros = galones * 3.78641;
        
        return galones +" galones son equivalentes a "+ litros + " litros." ;
    }
}
