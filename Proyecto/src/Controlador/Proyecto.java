
package Controlador;

import Modelo.Beverage;
import Modelo.Decaf;
import Modelo.DarkRoast;
import Modelo.Espresso;
import Modelo.Extra;
import Modelo.HouseBlend;
import Vista.Vista_1;
import Vista.Vista_2;
import Vista.Vista_3;
import Vista.Vista_4;

public class Proyecto {

    public static void main(String[] args) {
        
        
        DarkRoast darkRoast = new DarkRoast("DarkRoast");
        Decaf decaf = new Decaf("Decaf");
        Espresso espresso = new Espresso("Espresso");
        HouseBlend houseBlend = new HouseBlend("HouseBlend");
        
        Vista_4 v4 = new Vista_4();
        Vista_3 v3 = new Vista_3();
        Vista_2 v2 = new Vista_2();
        Vista_1 v1 = new Vista_1();
   
        
        Controlador c = new Controlador(darkRoast,espresso,decaf,houseBlend,v1,v2,v3,v4);
       
        
  
        v1.setVisible(true);
  
    }
    
}
