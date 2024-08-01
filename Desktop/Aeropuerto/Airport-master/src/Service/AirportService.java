package Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AirportService {
    
    /**
     * Escribir y guardar aeropuertos
     */
    private static final String airportsWritter = "airports.txt";

    public void writeToFile(String texto) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(airportsWritter, true));
            bw.write(texto + System.lineSeparator());
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(AirportService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Validaciones para campos de texto numéricos
     * @param texto
     * @return 
     */
    public static boolean validaNumeroEntero_Exp(String texto) {
        return texto.matches("^-?[0-9]+$");
    }
    
    public static boolean validaNumeroReal_Exp (String texto) {
        return texto.matches ("^-?\\d*\\.?\\d+[eE]?[-+]?\\d*$");
    }

    // Crear una instancia de la clase
    /*public static void main(String[] args) {
        
        AirportService pf = new AirportService();
        
        // Ejemplo de uso del método
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto a guardar en el archivo:");
        String texto = sc.nextLine();
        
        // Llamar al método para guardar el texto en el archivo
        pf.writeToFile(texto);
    }*/
}
