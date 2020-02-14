/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

import java.util.Random;

public class Golpeador extends Jugador {

    private int musculatura, reflejos,fuerza,aguilidad;
    Random r = new Random();

    public Golpeador(String nombre, int anio, String casa) {
        super(nombre, anio, casa);
        this.musculatura = 1 + r.nextInt(15);
        this.reflejos = 1 + r.nextInt(10);
        this.fuerza=setFuerza(musculatura);
        this.aguilidad=setAguilidad(reflejos);
                
    }

    public int getMusculatura() {
        return musculatura;
    }

    public void setMusculatura(int musculatura) {
        this.musculatura = musculatura;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int setFuerza(int musculatura) {
        return this.fuerza = (musculatura*2)-7;
    }

    public int getAguilidad() {
        return aguilidad;
    }

    public int setAguilidad(int reflejos) {
        return this.aguilidad = reflejos+7;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Golpeador{" + "musculatura=" + musculatura + ", reflejos=" + reflejos + ", fuerza=" + fuerza + ", aguilidad=" + aguilidad + ", r=" + r + '}';
    }
    
    

}
