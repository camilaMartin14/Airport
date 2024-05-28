package Classes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AirportManagement {

    public static void main(String[] args) {

        final int MAX_AIRPORTS = 20;
        
        final int TIPO_PUBLICO = 1;
        final int TIPO_PRIVADO = 2;
        
        final int AVION_ACTIVO = 1;
        final int AVION_NO_ACTIVO = 2;
        
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);
        
        Airport airports[] = new Airport[MAX_AIRPORTS];
        int numeroAeropuertos = 0;
        
        Airport airportAux;
        
        Address dAux;
        
        Airplane airplaneAux;

        
        boolean salir = false;
        int opcion, numero, anioIanuguracion, capacidad, eleccionTipo, eleccionActivo, numTrabajadoresDiscapacitados, numSocios, numeroAsientos, idAirport;
        String nombre, pais, ciudad, calle, modelo;
        double financiacion, velocidadMaxima, ganancia;
        
        
        
        
        while (!salir) {
            System.out.println("1. Añadir Aeropuerto");
            System.out.println("2. Añadir Avión");
            System.out.println("3. Mostrar información de aeropuerto");
            System.out.println("4. Mostrar años que lleva abierto un aeropuerto");
            System.out.println("5.Mostrar ganancias de un aeropuerto");
            System.out.println("6. Salir");

            try {
                System.out.println("Escribe una de las opciones:");
                opcion = sc.nextInt();
                
                switch (opcion){
                    case 1:
                        
                        if(numeroAeropuertos > MAX_AIRPORTS){
                            System.out.println("No se pueden meter más aeropuertos"); 
                        }else{
                           
                            System.out.println("Escribe el nombre del aeropuerto");
                            nombre = sc.next();
                            
                            System.out.println("Escribe el pais del aeropuerto");
                            pais = sc.next();
                            
                            System.out.println("Escribe la ciudad del aeropuerto");
                            ciudad = sc.next();
                            
                            System.out.println("Escribe la calle del aeropuerto");
                            calle = sc.next();
                            
                            System.out.println("Escribe numero (la altura de la calle) del aeropuerto");
                            numero = validateNumber(0, Integer.MAX_VALUE);
                            
                            System.out.println("Escribe el año de inauguración del aeropuerto");
                            anioIanuguracion = validateNumber(0, Integer.MAX_VALUE);
                            
                            System.out.println("Escribe la capacidad del aeropuerto");
                            capacidad = validateNumber(0, Integer.MAX_VALUE);
                            
                            System.out.println("¿Aeropuerto público o privado? (1 = público, 2 = privado)");
                            eleccionTipo = validateNumber(1,2);
                            
                            dAux = new Address(pais, ciudad, calle, numero);
                            
                            if (eleccionTipo == TIPO_PUBLICO) {
                                
                            System.out.println("Escribe el numero de trabajadores con capacidades especiales");
                            numTrabajadoresDiscapacitados = validateNumber(0, Integer.MAX_VALUE);
                                
                            System.out.println("Escribe la financiación del aeropuerto");
                            financiacion = sc.nextDouble();
                            
                            airportAux = new PublicAirport (financiacion, numTrabajadoresDiscapacitados, nombre, dAux, anioIanuguracion, capacidad);
                            
                            }else{
                                
                            System.out.println("Escribe la cantidad de socios del aeropuerto");
                            numSocios = validateNumber(0, Integer.MAX_VALUE);
                            
                            airportAux = new PrivateAirport (numSocios, nombre, dAux, anioIanuguracion, capacidad);
                            }
                            
                            airports[numeroAeropuertos] = airportAux;
                            numeroAeropuertos++;
                           
                        }
                        break;
                        
                    case 2:
                        if (numeroAeropuertos == 0) {
                            System.out.println("No hay aropuertos, debes añadir uno");
                        }else{
                            System.out.println("Escribe el modelo del avion");
                            modelo = sc.next();
                            
                            System.out.println("Escribe el numero de asientos del avion");
                            numeroAsientos = validateNumber(1, Integer.MAX_VALUE);
                            
                            System.out.println("Escribe la velocidad máxima del avión");
                            velocidadMaxima = sc.nextDouble();
                            
                            System.out.println("¿El avion está activo o no activo? (1 = activo, 2 = no activo)");
                            eleccionActivo = validateNumber(1,2);
                            
                            airplaneAux = new Airplane(modelo, numeroAsientos, velocidadMaxima);

                            if (eleccionActivo == AVION_ACTIVO) {
                                airplaneAux.setActivado(true);
                            }
                            System.out.println("Los aeropuertos existentes son:");
                            mostrarAeropuertos(airports, numeroAeropuertos);
                            
                            System.out.println("Elige un aeropuerto");
                            idAirport = sc.nextInt();
                            airportAux = chooseAirport (airports,numeroAeropuertos, idAirport);
                            
                            if (airportAux != null) {
                                airportAux.addAirplane(airplaneAux);
                            }else{
                                System.out.println("No existe el aeropuerto. El avion es desechado");
                            }
                        }
                        break;
                        
                    case 3:
                        System.out.println("Los aeropuertos existentes son");
                            mostrarAeropuertos(airports, numeroAeropuertos);
                            
                            System.out.println("Elige un aeropuerto");
                            idAirport = sc.nextInt();
                            airportAux = chooseAirport (airports,numeroAeropuertos, idAirport);
                            
                            if (airportAux != null) {
                                System.out.println(airportAux);
                            }else{
                                System.out.println("No existe el aeropuerto.");
                            }
                        
                        break;
                    case 4:
                        System.out.println("Los aeropuertos existentes son: ");
                            mostrarAeropuertos(airports, numeroAeropuertos);
                            
                            System.out.println("Elige un aeropuerto");
                            idAirport = sc.nextInt();
                            airportAux = chooseAirport (airports,numeroAeropuertos, idAirport);
                            
                            if (airportAux != null) {
                                System.out.println("Lleva funcionando "+airportAux.aniosAbierto() +" años.");
                            }else{
                                System.out.println("No existe el aeropuerto.");
                            }
                        break;
                        
                    case 5:
                        System.out.println("Los aeropuertos existentes son:");
                            mostrarAeropuertos(airports, numeroAeropuertos);
                            
                            System.out.println("Elige un aeropuerto");
                            idAirport = sc.nextInt();
                            airportAux = chooseAirport (airports,numeroAeropuertos, idAirport);
                            
                            if (airportAux != null) {
                                System.out.println("Escribe la ganancia del aeropuerto");
                                ganancia = sc.nextDouble();
                                
                                airportAux.gananciasTotales(ganancia);
                            }else{
                                System.out.println("No existe el aeropuerto.");
                            }
                        
                        break;
                        
                    case 6:
                        salir = true;
                        break;
                    default: 
                        System.out.println("Sólo números entre 1 y 6 incluídos");
                }
            }catch (InputMismatchException e){
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }
    }
   
    public static int validateNumber (int minimo, int maximo) {
        
        Scanner sc = new Scanner (System.in);
        
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
        
        int numero;
        do {
            
            System.out.println("");
           numero = sc.nextInt();
        
        if (!(numero>= minimo && numero <= maximo)) {
            System.out.println("Debes escribir un numero entre " + minimo + " y " +maximo);
        }
        
        }while (!(numero >= minimo && numero <= maximo));
        
        return numero;
        
        }
    public static void mostrarAeropuertos (Airport[] airports, int numeroAeropuertos) {
        for (int i = 0; i < numeroAeropuertos; i++) {
            if (airports[i] instanceof PrivateAirport) {
                System.out.println("Id: " +airports[i].getId()+"Nombre: "+airports[i].getNombre()+ "(privado)");
            }else{
            System.out.println("Id: " +airports[i].getId()+"Nombre: "+airports[i].getNombre()+"(público)");
            }
        }
    }
    
    public static Airport chooseAirport(Airport[] airports, int numeroAeropuertos, int idAirport){
        for (int i = 0; i < numeroAeropuertos; i++) {
            if (airports[i].getId()== idAirport) {
                return airports[i];
            }
        }
        return null;
    }
    
    
    
    
}

