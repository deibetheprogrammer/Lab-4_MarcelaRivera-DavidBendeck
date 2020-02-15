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
        this.velocidad = (200/peso)*7;
        this.reflejos = 1+r.nextInt(10);
        this.agilidad = reflejos + 7;
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

    public double setVelocidad(double velocidad) {
       return this.velocidad = velocidad;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public double setAgilidad(double agilidad) {
        return this.agilidad = agilidad;
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

    @Override
    public boolean modoDeJuego(double valor, boolean opcion) {
        if (velocidad + agilidad  >= valor) {
            System.out.printf("%s(%d - %s) Ha intentado meter gol: exitosamente%n", nombre, numero, casa);
            agilidad += 6;
            velocidad += 6;        
            return true;
        } else {
            System.out.printf("%s(%d - %s) Ha intentado meter gol: falló%n", nombre, numero, casa);
            return false;
        }
    }

    @Override
    public boolean trampa() {
        if (rand.nextInt(100) <= 10) {
            System.out.printf("%s(%d - %s) Ha intentado hacer trampa: exitosamente%n", nombre, numero, casa);
            return false;
        } else {
            System.out.printf("%s(%d - %s) Ha intentado hacer trampa: falló%n",nombre,numero,casa);
            return false;
        }
    }
   
    
}
