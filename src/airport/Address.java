
package airport;

public class Address {
    
    private String pais;
    private String ciudad;
    private String calle;
    private int numero;

    public Address() {
    }

    public Address(String pais, String ciudad, String calle, int numero) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return " de " + pais + ", " + ciudad + 
                " está en la " + calle + " " + numero;
    }
    
    
    
    
    
    
    
}