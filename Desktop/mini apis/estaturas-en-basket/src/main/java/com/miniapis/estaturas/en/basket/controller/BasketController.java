package com.miniapis.estaturas.en.basket.controller;

import com.miniapis.estaturas.en.basket.model.Jugador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasketController {
 @PostMapping ("/promedio-altura-jugadores")
    public String calcularPromedioEstatura (@RequestBody List<Jugador> listaJugadores) {
    
        double suma_estaturas=0.0;
        double promedio_estatura=0.0;
        
        //Los jugadores que me pasen en POST se guardan en esta ArrayList
        List<Jugador> lista = new ArrayList<Jugador>();
        lista = listaJugadores;
        
        //Método para sumar estaturas
        for (Jugador jugador : lista) {
            suma_estaturas = suma_estaturas + jugador.getEstatura();
        }
        
        promedio_estatura = suma_estaturas / (lista.size());

        return "El promedio de estatura de los jugadores es: " + promedio_estatura;
    }
}
