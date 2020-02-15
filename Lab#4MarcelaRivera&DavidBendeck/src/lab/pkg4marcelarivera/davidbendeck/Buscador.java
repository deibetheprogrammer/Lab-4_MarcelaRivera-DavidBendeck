/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

/**
 *
 * @author Mvrivera
 */
public class Buscador extends Jugador{

    private double peso,velocidad;

    public Buscador(double peso, String nombre, int anio, String casa) {
        super(nombre, anio, casa);
        this.peso = peso;
        this.velocidad = setVelocidad(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double setVelocidad(double peso) {
        return this.velocidad = (200/peso)*7;
    }

    @Override
    public String toString() {
        return "Buscador{" + "peso=" + peso + ", velocidad=" + velocidad + '}';
    }
   
    public void modoDeJuego(){
        
    }
    public  void trampa(){
        
    }
    
    
}
