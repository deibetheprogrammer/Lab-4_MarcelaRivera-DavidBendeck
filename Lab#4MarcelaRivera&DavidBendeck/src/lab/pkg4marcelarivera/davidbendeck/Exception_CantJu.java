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
public class Exception_CantJu extends Exception{
    private int Cant;

    public Exception_CantJu() {
    }

    public Exception_CantJu(int Cant) {
       super();
        this.Cant = Cant;
    }

    public int getCant() {
        return Cant;
    }

    public void setCant(int Cant) {
        this.Cant = Cant;
    }

    @Override
    public String toString() {
        return "Exception_CantJu{" + "Cant=" + Cant + '}';
    }
    
    
}
