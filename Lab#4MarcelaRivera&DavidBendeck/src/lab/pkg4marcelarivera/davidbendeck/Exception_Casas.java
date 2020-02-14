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
public class Exception_Casas extends Exception {
    private String casa;

    public Exception_Casas(String casa) {
       super();
       
        this.casa = casa;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Exception_Casas{" + "casa=" + casa + '}';
    }
    
    
    

    
    
    
}
