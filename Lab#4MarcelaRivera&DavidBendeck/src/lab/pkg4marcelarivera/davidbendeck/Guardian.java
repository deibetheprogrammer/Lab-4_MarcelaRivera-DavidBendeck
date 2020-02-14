/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

/**
 *
 * @author davidbendeck
 */
public class Guardian extends Jugador{
    
    private double reflejos;
    private double habilidad;

    public Guardian(double reflejos, double habilidad, String nombre, int anio, String casa) {
        super(nombre, anio, casa);
        this.reflejos = reflejos;   
        this.habilidad=setHabilidad(reflejos);
    }

    public double getReflejos() {
        return reflejos;
    }

    public void setReflejos(double reflejos) {
        this.reflejos = reflejos;
    }

    public double getHabilidad() {
        return habilidad;
    }

    public double setHabilidad(double reflejos) {
       return this.habilidad = reflejos+7;
    }

    @Override
    public String toString() {
        return "Guardian{" + "reflejos=" + reflejos + ", habilidad=" + habilidad + '}';
    }
    public void modoDeJuego(){
        
    }
    
     public  void trampa(){
        
    }
    
    
}
