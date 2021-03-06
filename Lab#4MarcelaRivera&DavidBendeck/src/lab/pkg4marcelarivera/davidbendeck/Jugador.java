/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

import java.util.Random;

/**
 *
 * @author davidbendeck
 */
public abstract class Jugador {
    Random rand = new Random();
    
    protected String nombre;
    protected int anio;
    protected String casa;
    protected int numero;

    public Jugador() {
    }

    public Jugador(String nombre, int anio, String casa) {
        this.nombre = nombre;
        this.anio = anio;
        this.casa = casa;
        setNumero();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = rand.nextInt(26) + rand.nextInt(26);
    }
    
    public abstract boolean modoDeJuego(double valor, boolean opcion);
    public abstract boolean trampa();
    
}

