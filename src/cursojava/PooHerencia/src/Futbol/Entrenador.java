
package Futbol;

import pooherencia.Seleccion;


public abstract class Entrenador extends Seleccion{
    private String idFederacion;

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
     @Override
    public int concentrarSe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void dirigirPartido(double tiempo){
        System.out.println("Ha transcurrido " + tiempo + " del partido");
    }
    
    public void dirigirPartido(){
        System.out.println("El partido empiza tarde");
    }
    public void dirigirEntrenamiento(){
        
    }
}
