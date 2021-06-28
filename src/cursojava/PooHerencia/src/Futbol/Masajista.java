
package pooherencia;


public abstract class Masajista extends Seleccion{
     private String titulacion;
     private int anosExperiencia; 

    public Masajista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
     @Override
    public int concentrarSe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int concentrarSe(String parteDelcuerpo) {
        System.out.println("El masajista concentra su trabajo en  " + parteDelcuerpo + " que estaba lesionada");
        return anosExperiencia;
    }

    @Override
    public String viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void darMasaje(){
        
    }
}
