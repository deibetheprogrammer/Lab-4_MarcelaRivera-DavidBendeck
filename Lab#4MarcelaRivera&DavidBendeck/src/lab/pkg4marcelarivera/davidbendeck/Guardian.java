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

    public Guardian() {
    }

    
    public Guardian(double reflejos, String nombre, int anio, String casa) {
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
<<<<<<< HEAD
    
    public void modoDeJuego(){
=======
    @Override
    public void trampa() {
>>>>>>> 9888883f911fbd99bcfb92e06b62bfb47d59030e
        
    }

    @Override
    public void modoDeJuego(int valor, boolean opcion) {
        if (this.habilidad > valor) {
            System.out.printf("%s(%d - %s) Ha intentado atajar un gol: exitosamente%n",nombre,numero,casa);
            this.habilidad += 8;
        }
        
        else{
            System.out.printf("%s(%d - %s) Ha intentado atajar un gol: falló%n",nombre,numero,casa);
        }
    }
    
     
    
}
