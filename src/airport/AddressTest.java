package airport;

public class AddressTest {

    public static void main(String[] args) {
        //mi aeropuerto a1 (llamado asi en otras clases)
        Airport Cordoba = new Airport("Ingeniero Ambrosio Taravella", 
               "Argentina", "Cordoba", "Ruta", 30, 1927, 250000 );  
        
        System.out.println(Cordoba);

        System.out.println(Cordoba.aniosAbierto());

        
        //mi aeropuerto a2
        Airport BuenosAires = new Airport("Ministro Pistarini", 
               "Argentina", "Buenos Aires", "Ruta", 60, 1949, 360000 );  
        
        System.out.println(BuenosAires);
        
        System.out.println(BuenosAires.aniosAbierto());
    }
    
}