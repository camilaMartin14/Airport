package com.miniapis.estaturas.en.basket.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Jugador {
   

    public long id;
    public int dni;
    public String nombre;
    public String apellido;
    public int edad;
    public double peso;
    public double estatura;

    public Jugador() {
    }

    public Jugador(long id, int dni, String nombre, String apellido, int edad, double peso, double estatura) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
}
