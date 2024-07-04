package com.ejerciciosspringboot.odontologo.controller;

import com.ejerciciosspringboot.odontologo.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdontologoController {
    @GetMapping ("/pacientes/traer")
    @ResponseBody
    public List <Paciente> traerPacientes(){
        
        List <Paciente> listaPacientes = new ArrayList <Paciente>();
        
        listaPacientes.add (new Paciente (1, 45647980, "Camila", "Martin", LocalDate.of(2004,3, 14)));
        listaPacientes.add (new Paciente (2, 42564289, "Ramiro", "Quinteros", LocalDate.of(2002,2, 10)));
        listaPacientes.add (new Paciente (3, 25647220, "Alexia", "Tobares", LocalDate.of(2004,6, 28)));
        listaPacientes.add (new Paciente (4, 12347980, "Monica", "Argento", LocalDate.of(1975,5, 12)));
        listaPacientes.add (new Paciente (5, 62447980, "Silvia", "Chavarria", LocalDate.of(2010,1, 14)));

        //devuelvo toda la lista de pacientes
        return listaPacientes;
    }
    
    @GetMapping ("/pacientes/menores")
    @ResponseBody
    public List<Paciente> traerMenores() {
        
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        
        listaPacientes.add (new Paciente (1, 45647980, "Camila", "Martin", LocalDate.of(2004,3, 14)));
        listaPacientes.add (new Paciente (2, 42564289, "Ramiro", "Quinteros", LocalDate.of(2002,2, 10)));
        listaPacientes.add (new Paciente (3, 25647220, "Alexia", "Tobares", LocalDate.of(2004,6, 28)));
        listaPacientes.add (new Paciente (4, 12347980, "Monica", "Argento", LocalDate.of(1975,5, 12)));
        listaPacientes.add (new Paciente (5, 62447980, "Silvia", "Chavarria", LocalDate.of(2010,1, 14)));
         
        //Creo lista para guardar a los menores
        List<Paciente> listaMenores = new ArrayList<Paciente>();
         
        for (Paciente pac : listaPacientes) {
            
            //fecha de hoy
            LocalDate hoy = LocalDate.now();
            //calculo período entre fecha de nacimiento del paciente y fecha de hoy 
            Period cant_anios = Period.between(pac.getFecha_nacimiento(), hoy);
            //si es menor de 18 lo agrego a lista menores
            if (cant_anios.getYears()<18) {
                System.out.println("Edad del paciente: " + cant_anios.getYears());
                listaMenores.add(pac);
            }
        }
        return listaMenores;
    }
}
