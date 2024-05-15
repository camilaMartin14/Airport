
package airport;

public class AssociationTest {

    public static void main(String[] args) {
        
        Address direccion = new Address ("Argentina", "Cordoba", "Ruta", 30);
        
        Airport a1 = new Airport ("Ingeniero Ambrosio Taravella", direccion, 1927, 250000);
        
        Airplane av = new Airplane ("Boeing B-737-700", 220, 500);
        
        Airplane av2 = new Airplane ("Embraer ERJ-140LR", 200, 400);
        
        a1.addAirplane(av);
        a1.addAirplane (av2);
        
        
        
        System.out.println("El aeropuerto de Córdoba cuenta con "+ a1.getNumero_aviones()+ " aviones.");

        System.out.println(a1);



    }
    
}
