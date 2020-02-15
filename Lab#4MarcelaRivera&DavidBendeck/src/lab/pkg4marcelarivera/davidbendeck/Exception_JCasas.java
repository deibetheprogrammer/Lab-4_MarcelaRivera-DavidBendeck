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
public class Exception_JCasas extends Exception{
    private String casa_j,casa_equipo;

    public Exception_JCasas() {
    }

    public Exception_JCasas(String casa_j, String casa_equipo) {
     super();
        this.casa_j = casa_j;
        this.casa_equipo = casa_equipo;
    }

    public String getCasa_j() {
        return casa_j;
    }

    public void setCasa_j(String casa_j) {
        this.casa_j = casa_j;
    }

    public String getCasa_equipo() {
        return casa_equipo;
    }

    public void setCasa_equipo(String casa_equipo) {
        this.casa_equipo = casa_equipo;
    }

    @Override
    public String toString() {
        return "Exception_JCasas{" + "casa_j=" + casa_j + ", casa_equipo=" + casa_equipo + '}';
    }
    
    
    
    
    
}
