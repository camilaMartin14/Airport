package airport;

import java.util.Calendar;

public class Airport implements Comparable <Airport> {
    
    //Generar atributo estático, a este si lo defino aca y no en el constructor 
    private static int idAutonumerado = 1;
    //todos los objetos comparten este atributo, sirve para numerar o poner ids.
    
    
    
    private final int MAX_AIRPLANES = 20;
    
    //Atributos
    private int id;
    private String nombre;
    private Address address; //defino el objeto creado en address como atributo
    private int anioInauguracion;
    private int capacidad;
    private Airplane[] airplanes;//no se recomienda pasar array directamente sino hacerlo en los constructores
    private int numero_aviones;
    
   //Constructores 
    public Airport() {
       //lo llamo vacio pq es el constructor vacio
       this("","","","", 0,0,0);//evita repetir lineas, sobretodo para objetos grandes


    }
    public Airport(String nombre, Address address, int anioInauguracion, int capacidad) {
        
        
        this(nombre, address.getPais(),
                address.getCiudad(),
                address.getCalle (),
                address.getNumero(),
                anioInauguracion
                , capacidad);
        
        /*Constructor anterior al this---> this se usa para menos trabajo
        
        this.id = idAutonumerado++;

        this.nombre = nombre;
        this.address = address;
        this.anioInauguracion = anioInauguracion;
         this.capacidad = capacidad;
        airplanes = new Airplane[MAX_AIRPLANES]; 
        this.numero_aviones = 0;*/
        

    }
    public Airport(String nombre, String pais, String ciudad, String calle,
                   int numero, int anioInauguracion, int capacidad) {
        
        this.id = idAutonumerado++;
        this.nombre = nombre;
        this.address = new Address (pais, ciudad, calle, numero);
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
        airplanes = new Airplane[MAX_AIRPLANES]; 
        this.numero_aviones = 0;
        
    }

    
    //Getters y Settes
    public int getNumero_aviones() { //este solo tiene el get
        return numero_aviones;
    }
    

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioInauguracion() {
        return anioInauguracion;
    }

    public void setAnioInauguracion(int anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
    
    //Función creada manualmente por mí
    public int aniosAbierto(){
    
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        return anioActual - this.anioInauguracion;
    }
    
    //Funcion creada manualmente por mi
    public void addAirplane (Airplane a1){
        if (numero_aviones <= MAX_AIRPLANES) {
           
            this.airplanes[numero_aviones] = a1; //indice de elementos q tengo actualmente
            numero_aviones++;
        }else{
            System.out.println("No puedes meter más aviones"); 
           
        }
    }
    
    //Funcion creada manualmente por mi
    private String showAirplanes (){
        
        String airplanesString = "";
        for (int i = 0; i < numero_aviones; i++) {//numero aviones sirve de indice y de parametro
           airplanesString += this.airplanes[i].toString() + "\n";
        }
        return airplanesString;
        
    }
    /*
    Usa equals y compareTo: dos aeropuertos son iguales cuando el id es igual, 
    un aeropuerto es mayor que el otro cuanto más actual es.
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
    
    
    
    
    //toString (siempre al último para que tome todos los métodos)
    @Override
    public String toString() {
        return "El aeropuerto con id: " + id + " de nombre " + nombre + this.address.toString() +  ", fue inaugurado en " 
                + anioInauguracion + " y tiene una capacidad de " + capacidad 
                + " personas " + ". Cuenta con los siguientes aviones: \n" + showAirplanes();
    }

   
    
    
}