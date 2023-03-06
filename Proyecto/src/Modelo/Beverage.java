
package Modelo;

public abstract class Beverage {
    
    private String descripcion;
    
   // String mesero;

    public Beverage(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public String getDescripcion() {
        return descripcion;
    }
    
    public abstract double costo();
    
}
