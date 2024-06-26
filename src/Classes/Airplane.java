package Classes;

public class Airplane implements Activable {
    //Atributes (solo definimos, no damos valores)
    private String modelo;
    private int numeroAsientos;
    private double velocidadMaxima;
    private boolean activado;
    
    //Constructores (mismo nombre de la clase, no lleva modifiers)
    public Airplane (){
        this("",0,0);
        
    }
    /*Metodos o propiedades
    get y set : asegurar que los datos de un objeto se manipulen de manera 
    segura y controlada, facilitando el encapsulamiento.*/
    
    public Airplane(String modelo, int numeroAsientos, double velocidadMaxima) {
        this.modelo = modelo;
        this.numeroAsientos = numeroAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.activado = false;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Airplane{" + "modelo=" + modelo + ", numeroAsientos=" + numeroAsientos + ", velocidadMaxima=" + velocidadMaxima + '}';
    }

    @Override
    public boolean isActivado() {
        return activado;
    }

    @Override
    public void setActivado(boolean value) {
        this.activado = value;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //NO SE EN DONDE VA ESTO
    
    
    
    /**@Override
    public boolean isActivado() {
        return activado;
    }

    @Override
    public void setActivado(boolean value) {
    this.activado = value;
    }
    */
}
