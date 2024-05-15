
package airport;

public class AirportTest {

    public static void main(String[] args) {

       Airport Cordoba = new Airport("Ingeniero Ambrosio Taravella", 
               "Argentina", "Cordoba", "Ruta", 30, 1927, 250000 );  
        
       System.out.println(Cordoba.toString());
       
       System.out.println(Cordoba.aniosAbierto());
    }
    
}
