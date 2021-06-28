
package pooherencia;

public abstract class Futbolista extends Seleccion{
    
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    @Override
    public int concentrarSe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int concentrarSe(int minutosConDorsal) {
       dorsal += minutosConDorsal;
       return dorsal;
    }

    @Override
    public String viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void jugarPartido(){
        
    }
    
    public void entrenar(){
        
    }
}
