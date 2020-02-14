/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

import java.util.Random;

/**
 *
 * @author Mvrivera
 */
public class Cazadores extends Jugador{

   private double peso,velocidad,agilidad;
   private int reflejos;

   Random r=new Random();
    public Cazadores(double peso, String nombre, int anio, String casa) {
        super(nombre, anio, casa);
        this.peso = peso;
        this.velocidad = setVelocidad(peso);
        this.agilidad = setAgilidad(peso);
        this.reflejos = 1+r.nextInt(10);
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

    public double getAgilidad() {
        return agilidad;
    }

    public double setAgilidad(double reflejos) {
return        this.agilidad = reflejos+7;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }
   
    
   
    
}
