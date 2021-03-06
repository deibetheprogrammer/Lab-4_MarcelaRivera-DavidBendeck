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
    private ArrayList<Jugador> jugadores=new ArrayList();
    private String casa;
    private Jugador capitan;
    
    public Equipo() {
    }

    public Equipo(String casa) throws Exception_Casas{
        if ((casa.equals("gryffindor"))||(casa.equals("slytherin"))||(casa.equals("ravenclaw"))||(casa.equals("hufflepuff"))){
            this.casa=casa;    
             }else{
            throw new Exception_Casas(casa);
      
        }
        
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
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

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

  

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "cant_ganados=" + cant_ganados + ", cant_perdidos=" + cant_perdidos + ", jugadores=" + jugadores + ", casa=" + casa + '}';
    }

   
    
    
}
