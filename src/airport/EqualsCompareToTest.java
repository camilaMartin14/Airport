package airport;

public class EqualsCompareToTest {
    //comparo sólo los años de inauguración

    public static void main(String[] args) {
        Address d = new Address ("Argentina", "Cordoba", "Ruta", 30);
        
        Airport a1 = new Airport ("Ingeniero Ambrosio Taravella", d, 1920, 250000);
        
        Airport a2 = new Airport ("Ministro Pistarini", "Argentina", 
                                  "Buenos Aires", "Ruta", 60, 1949, 360000 );
        
        
        if (a1.equals (a2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        switch (a1.compareTo(a2)){
            case 1:
                System.out.println("a1 es más moderno (mayor) que a2");
                break;
            case 0:
                System.out.println("a1 es igual de antiguo que a2");
                break;
            case -1:
                System.out.println("a1 es más antiguo (menor) que a2");
                break;
            
            
        }
    }
}