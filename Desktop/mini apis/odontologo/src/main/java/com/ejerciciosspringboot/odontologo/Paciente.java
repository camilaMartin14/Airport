package com.ejerciciosspringboot.odontologo;

import java.time.LocalDate;

public class Paciente {
  
    public int id;
    public int DNI;
    public String nombre;
    public String apellido;
    public LocalDate fecha_nacimiento;

    public Paciente() {
    }

    public Paciente(int id, int DNI, String nombre, String apellido, LocalDate fecha_nacimiento) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
}
