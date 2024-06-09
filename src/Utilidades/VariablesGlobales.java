package Utilidades;

import Classes.Airport;
import java.io.Serializable;
import java.util.ArrayList;

public class VariablesGlobales implements Serializable{
    public static ArrayList <Airport> airports = new ArrayList<>();
    public static String FICHERO_AIRPORTS = "datos/airport.ddr";
}
