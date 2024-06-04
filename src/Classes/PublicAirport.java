package Classes;

public class PublicAirport extends Airport{

    private double financiacion;
    private int numTrabajadoresDiscapacitados;

    public PublicAirport(double financiacion, 
                        int numTrabajadoresDiscapacitados){
        super ();//Hace referencia a clase madre
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    public PublicAirport(double financiacion, int numTrabajadoresDiscapacitados,
                        String nombre, Address address, int anioInauguracion, 
                        int capacidad) {
        super(nombre, address, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    public PublicAirport(double financiacion, int numTrabajadoresDiscapacitados,
                        String nombre, String pais, String ciudad, String calle,
                        int numero, int anioInauguracion, int capacidad) {
        super(nombre, pais, ciudad, calle, numero, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    public double getFinanciacion() {
        return financiacion;
    }

    public void setFinanciacion(double financiacion) {
        this.financiacion = financiacion;
    }

    public int getNumTrabajadoresDiscapacitados() {
        return numTrabajadoresDiscapacitados;
    }

    public void setNumTrabajadoresDiscapacitados(int numPilotos) {
        this.numTrabajadoresDiscapacitados = numPilotos;
    }

    @Override
    public String toString() {
        return super.toString()+ 
                "Es público y su financiación por parte del estado es de "+
                financiacion + " y cuenta con " + numTrabajadoresDiscapacitados+
                " trabajadores con capacidades diferentes.";
    }

    public void gananciasTotales(double cantidad) {

        double ganancias = cantidad + financiacion + (numTrabajadoresDiscapacitados * 100);
        System.out.println("La ganancia ha sido de "+ ganancias);
    }
}
