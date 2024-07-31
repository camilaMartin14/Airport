package model;

import java.util.ArrayList;

public abstract class Airport {
    
    private int id;
    private String name;
    private Address address;
    private int openingDate;
    private int capacity;
    private ArrayList <Airplane> airplanes;
    
    public Airport() {
        
    }

    public Airport(int id, String name, Address address, int openingDate,
                    int capacity, ArrayList<Airplane> airplanes) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.openingDate = openingDate;
        this.capacity = capacity;
        this.airplanes = airplanes;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(int openingDate) {
        this.openingDate = openingDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
    
    //Organizar despues estos metodos
    /*
    public final int aniosAbierto(){
        //ponemos final para que en las clases hijas no se modifique
    
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        return anioActual - this.anioInauguracion;
    }
    

    public void addAirplane (Airplane a){
        if (a != null) {
            this.airplanes.add(a); 
        }else{
            System.out.println("¡No debe ser nulo!"); 
        }
    }
    
     public void deleteAirplane (Airplane a){
        if (a != null) {
            this.airplanes.remove(a); 
        }else{
            System.out.println("¡No debe ser nulo!"); 
        }
    }
     

    private String showAirplanes (){
        
        String airplanesString = "";
        for (Airplane a: airplanes) {
            if (a.isActivado()) {
           airplanesString += a.toString() + "\n";
            }
        }
        return airplanesString;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Airport other = (Airport) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    public int compareTo(Airport o) {

        if(this.anioInauguracion < o.getAnioInauguracion()){
           return -1; 
        }else if (this.anioInauguracion > o.getAnioInauguracion()){
            return 1;
        }else{
            return 0;
            }
    }
    
    public abstract String gananciasTotales (double cantidad);

    @Override
    public String toString() {
        return "El aeropuerto con id: " + id + " de nombre " + nombre + " "
                +this.address.toString() + ", fue inaugurado en " 
                + anioInauguracion + " y tiene una capacidad de " + capacidad +
                " personas. \n " + " Cuenta con los siguientes aviones: \n" +
                showAirplanes() +"\n ";
    }

    public void aniadirAvion(Airplane a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public ArrayList <Airplane> getAirplanes(){
        return airplanes;
    }
     public void eliminarAvion (Airplane a){
        if (a !=null) {
            this.airplanes.remove(a);
        }else{
            System.out.println("No debe ser nulo");
        }
    }
    
    public boolean tieneAviones(){
        return this.airplanes.size()>0;
    }

    public Airplane getAirplane (String nombre){
        for(Airplane a: airplanes){
            if (a.getModelo().equalsIgnoreCase(nombre)) {
               return a;
            }
        }
        return null;
    }*/




}