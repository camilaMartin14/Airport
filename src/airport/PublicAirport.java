package airport;

public class PublicAirport extends Airport{
    //En Java la herencia es unica (solo hereda de una clase)
    private double financiacion;
    private int numPilotos;

    public PublicAirport(double financiacion, int numPilotos) {
        super ();//Hace referencia a clase madre
        this.financiacion = financiacion;
        this.numPilotos = numPilotos;
    }

    public PublicAirport(double financiacion, int numPilotos, String nombre, Address address, int anioInauguracion, int capacidad) {
        super(nombre, address, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numPilotos = numPilotos;
    }

    public PublicAirport(double financiacion, int numPilotos, String nombre, String pais, String ciudad, String calle, int numero, int anioInauguracion, int capacidad) {
        super(nombre, pais, ciudad, calle, numero, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numPilotos = numPilotos;
    }

    public double getFinanciacion() {
        return financiacion;
    }

    public void setFinanciacion(double financiacion) {
        this.financiacion = financiacion;
    }

    public int getNumPilotos() {
        return numPilotos;
    }

    public void setNumPilotos(int numPilotos) {
        this.numPilotos = numPilotos;
    }

    @Override
    public String toString() {
        return "PublicAirport{" + "financiacion=" + financiacion + ", numPilotos=" + numPilotos + '}';
    }
    
    
    
    
}
