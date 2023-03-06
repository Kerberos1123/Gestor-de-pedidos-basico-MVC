
package Modelo;

public abstract class DecoradorExtra implements Extra {
    
    private final Extra extra;
    
    public DecoradorExtra(Extra extra){
        this.extra = extra;
    }
    @Override
    public String agregarExtraMocha(){
      return  this.extra.agregarExtraMocha();
    }
     @Override
    public String agregarExtraCaramel(){
      return  this.extra.agregarExtraCaramel();
    }
     @Override
    public String agregarExtraSteamedMilk(){
      return  this.extra.agregarExtraSteamedMilk();
    }
      @Override
    public String agregarExtraSoy(){
      return  this.extra.agregarExtraSoy();
    }
    
}
