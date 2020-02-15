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
        this.habilidad= reflejos + 7;
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

    public double setHabilidad(double habilidad) {
       return this.habilidad = habilidad;
    }

    @Override
    public String toString() {
        return "Guardian{" + "reflejos=" + reflejos + ", habilidad=" + habilidad + '}';
    }
    
    @Override
    public boolean modoDeJuego(double valor, boolean opcion) {
        if (this.habilidad > valor) {
            System.out.printf("%s(%d - %s) Ha intentado atajar un gol: exitosamente%n",nombre,numero,casa);
            this.habilidad += 8;
            return true;
        }
        
        else{
            System.out.printf("%s(%d - %s) Ha intentado atajar un gol: falló%n",nombre,numero,casa);
            return false;
        }
    }

    @Override
    public boolean trampa() {
        if(rand.nextInt(100) <= 13) {
            System.out.printf("%s(%d - %s) Ha intentado hacer trampa: exitosamente%n",nombre,numero,casa);
            return true;
        }
        else {
            System.out.printf("%s(%d - %s) Ha intentado hacer trampa: falló%n",nombre,numero,casa);
            return false;
        }
    }
    
     
    
}
