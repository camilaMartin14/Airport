package Classes;
/**
 * Class Airport, represents an airport
 * @author camilaMartin14
 */
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Airport implements Comparable <Airport> {
    
    private static int idAutonumerado = 1;
    
    private int id;
    private String nombre;
    private Address address;
    private int anioInauguracion;
    private int capacidad;
    private ArrayList <Airplane> airplanes;
    
    /**
     * Constructor vacio
     */
    public Airport() {
        
        this("","","","", 0,0,0);
        this.id = idAutonumerado++;
    }
    
    /**
     * Constructor con direccion
     * @param nombre
     * @param address
     * @param anioInauguracion
     * @param capacidad 
     */
    public Airport(String nombre, Address address, int anioInauguracion,
                    int capacidad) {
        
        this(nombre, address.getPais(),
                address.getCiudad(),
                address.getCalle (),
                address.getNumero(),
                anioInauguracion
                , capacidad);
    }
    
    /**
     * Constructor completo
     * @param nombre
     * @param pais
     * @param ciudad
     * @param calle
     * @param numero
     * @param anioInauguracion
     * @param capacidad 
     */
    public Airport(String nombre, String pais, String ciudad, String calle,
                   int numero, int anioInauguracion, int capacidad) {
        
        this.id = idAutonumerado++;
        this.nombre = nombre;
        this.address = new Address (pais, ciudad, calle, numero);
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
        this.airplanes = new ArrayList <>(); 
    }
    
    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    
    /**
     * 
     * @return 
     */
    public Address getAddress() {
        return address;
    }
    
    /**
     * 
     * @param address 
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return 
     */
    public int getAnioInauguracion() {
        return anioInauguracion;
    }
    
    /**
     * 
     * @param anioInauguracion 
     */
    public void setAnioInauguracion(int anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }
    
    /**
     * 
     * @return 
     */
    public int getCapacidad() {
        return capacidad;
    }

    public static void setIdAutonumerado(int idAutonumerado) {
        Airport.idAutonumerado = idAutonumerado;
    }
    
    /**
     * 
     * @param capacidad 
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    /**
     * 
     * @return 
     */
    public final int aniosAbierto(){
        //ponemos final para que en las clases hijas no se modifique
    
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        return anioActual - this.anioInauguracion;
    }
    
    /**
     * 
     * @param a 
     */
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
     
    /**
    * 
    * @return 
    */
    private String showAirplanes (){
        
        String airplanesString = "";
        for (Airplane a: airplanes) {
            if (a.isActivado()) {
           airplanesString += a.toString() + "\n";
            }
        }
        return airplanesString;
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
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
    
    /**
     * 
     * @param o
     * @return 
     */
     @Override
    public int compareTo(Airport o) {

        if(this.anioInauguracion < o.getAnioInauguracion()){
           return -1; 
        }else if (this.anioInauguracion > o.getAnioInauguracion()){
            return 1;
        }else{
            return 0;
            }
    }
    
    /**
     * 
     * @param cantidad 
     */
    public abstract String gananciasTotales (double cantidad);
    
    /**
     * 
     * @return 
     */
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
}