
package Modelo;

public class Decaf extends Beverage implements Extra{

    public Decaf(String descripcion) {
        super(descripcion);
    }

    @Override
    public double costo() {
        double precio = 0;
        return precio+1200;
     
    }

    @Override
    public String agregarExtraMocha() {
          return getDescripcion()+ " Mocha " + " con " + " Leche batida ";
    }

    @Override
    public String agregarExtraSoy() {
        return " Soy " + " con " + " Leche batida ";
    }

    @Override
    public String agregarExtraCaramel() {
         return " Caramel " + " con " + " Leche batida ";
    }

    @Override
    public String agregarExtraSteamedMilk() {
           return " SteamedMilk" + " con " + " Leche batida ";
    }
    
}
