package Utilidades;

import Classes.Airport;
import Classes.PrivateAirport;
import java.io.EOFException;
import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JComboBox;


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
        actualizarId();
    }
    
    public static void escribirAeropuertos(Airport a, boolean aniadirLista) throws FileNotFoundException, IOException{
        
        File f = new File (VariablesGlobales.FICHERO_AIRPORTS);
        
        if (f.exists()) {
            MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AIRPORTS));
            oos.writeObject(a);
            oos.close();
           
        }else {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AIRPORTS));
            oos.writeObject(a);
            oos.close();
        }
        
        if (aniadirLista) {
            VariablesGlobales.airports.add(a);
        }
    }
    
    public static void cargarAeropurtos (JComboBox cmb) {
        String estado = "";
        
        for(Airport aux: VariablesGlobales.airports){
            estado = aux.getNombre();
            if (aux instanceof PrivateAirport) {
                estado += "(Privado)";
            }else{
                estado += "(Público)";
            }
            cmb.addItem(estado);
        }
    }
    
    public static void actualizarFichero() throws IOException {
        
        File f = new File (VariablesGlobales.FICHERO_AIRPORTS);
        
        f.delete();
        
        for(Airport aux : VariablesGlobales.airports){
            escribirAeropuertos(aux, false);
        }
    }

    public static void actualizarId(){
   
        if(VariablesGlobales.airports.size()>0 ){
            
            int idMayor= 1;
            for(Airport aux: VariablesGlobales.airports){
                
                if (aux.getId()> idMayor) {
                    idMayor = aux.getId();
                }
            }
            
            Airport.setIdAutonumerado(idMayor+ 1);
        }
    }
    
    public static boolean validaNumeroEntero_Exp(String texto) {
        return texto.matches("^-?[0-9]+$");
    }
    
    public static boolean validaNumeroReal_Exp (String texto) {
        return texto.matches ("^-?\\d*\\.?\\d+[eE]?[-+]?\\d*$");
    }
}
