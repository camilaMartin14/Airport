package Utilidades;

import Classes.Airport;
import java.io.EOFException;
import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MetodosSueltos {
 
    public static void leerAeropuertos () {
       
        try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream (VariablesGlobales.FICHERO_AIRPORTS))) {
         
            while (true) {
            Airport a = (Airport) ois.readObject();
            VariablesGlobales.airports.add(a);
            }
    
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex){
                System.out.println(ex.getMessage());
        } 
 
    }
    
    public static void escribirAeropuerto(Airport a) throws FileNotFoundException, IOException{
        
        File f = new File (VariablesGlobales.FICHERO_AIRPORTS);
        
        if (f.exists()) {
            MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AIRPORTS));
            //oos.writeObject(a);
            //oos.close();
        }else {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AIRPORTS));
            oos.writeObject(a);
            oos.close();
        }
        
        VariablesGlobales.airports.add(a);
    }
    public static boolean validaNumeroEntero_Exp(String texto) {
        return texto.matches("^-?[0-9]+$");
    }
    
    public static boolean validaNumeroReal_Exp (String texto) {
        return texto.matches ("^-?[0-9]+$");
    }

}
