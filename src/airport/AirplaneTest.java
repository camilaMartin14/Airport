package airport;

public class AirplaneTest {

   
    public static void main(String[] args) {
    
        Airplane a1 = new Airplane();
        
        a1.setModelo("Boeing B-737-700");
        a1.setNumeroAsientos(220);
        
        
        
        Airplane a2 = new Airplane ("Embraer ERJ-140LR", 200, 400);//llama constructor
        System.out.println(a2.toString());//llamar al objeto con sus caracteristicas explicadas
        
    
    
    
    
    
    
    }
    
}
