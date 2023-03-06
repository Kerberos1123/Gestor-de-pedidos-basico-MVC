
package Modelo;

import Vista.Vista_3;

public class DarkRoast extends Beverage implements Extra{

    public DarkRoast(String descripcion) {
        super(descripcion);
    }

    
    @Override
    public double costo() {
        double precio = 0;
        return precio+1500;
       
    }
 
 

    @Override
    public String agregarExtraMocha() {
       return " Mocha " + " con " + " Leche batida ";
    }

    @Override
    public String agregarExtraSoy() {
      return  " Soy " + " con " + " Leche batida ";
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
