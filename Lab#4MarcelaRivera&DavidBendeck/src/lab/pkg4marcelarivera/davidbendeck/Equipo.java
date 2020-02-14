/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

import java.util.ArrayList;

/**
 *
 * @author davidbendeck
 */
public class Equipo {
    private int cant_ganados,cant_perdidos;
    private double p_agilidad,p_velocidad,p_fuerza;
    private ArrayList<Jugador> jugadores=new ArrayList();
    private Capitan capitan;

    public Equipo() {
    }

    public Equipo(int cant_ganados, int cant_perdidos, double p_agilidad, double p_velocidad, double p_fuerza, Capitan capitan) {
        this.cant_ganados = cant_ganados;
        this.cant_perdidos = cant_perdidos;
        this.p_agilidad = p_agilidad;
        this.p_velocidad = p_velocidad;
        this.p_fuerza = p_fuerza;
        this.capitan = capitan;
    }

    public int getCant_ganados() {
        return cant_ganados;
    }

    public void setCant_ganados(int cant_ganados) {
        this.cant_ganados = cant_ganados;
    }

    public int getCant_perdidos() {
        return cant_perdidos;
    }

    public void setCant_perdidos(int cant_perdidos) {
        this.cant_perdidos = cant_perdidos;
    }

    public double getP_agilidad() {
        return p_agilidad;
    }

    public void setP_agilidad(double p_agilidad) {
        this.p_agilidad = p_agilidad;
    }

    public double getP_velocidad() {
        return p_velocidad;
    }

    public void setP_velocidad(double p_velocidad) {
        this.p_velocidad = p_velocidad;
    }

    public double getP_fuerza() {
        return p_fuerza;
    }

    public void setP_fuerza(double p_fuerza) {
        this.p_fuerza = p_fuerza;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    @Override
    public String toString() {
        return "Equipo{" + "cant_ganados=" + cant_ganados + ", cant_perdidos=" + cant_perdidos + ", p_agilidad=" + p_agilidad + ", p_velocidad=" + p_velocidad + ", p_fuerza=" + p_fuerza + ", jugadores=" + jugadores + ", capitan=" + capitan + '}';
    }
    
    
    
}
