package airport;

public class idTest {

    public static void main(String[] args) {

        Address direccion = new Address ("Argentina", "Cordoba", "Ruta", 30);
        
        Airport a1 = new Airport ("Ingeniero Ambrosio Taravella", direccion, 1927, 250000);
        
        Airport a2 = new Airport ("Ingeniero Ambrosio Taravella", direccion, 1927, 250000);
        
        Airport a3 = new Airport ("Ingeniero Ambrosio Taravella", direccion, 1927, 250000);
        
        Airport a4 = new Airport ("Ingeniero Ambrosio Taravella", direccion, 1927, 250000);
        
        Airport a5 = new Airport ("Ingeniero Ambrosio Taravella", direccion, 1927, 250000);
        
        Airport a6 = new Airport ("Ingeniero Ambrosio Taravella", direccion, 1927, 250000);
       
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

    }
    
}
