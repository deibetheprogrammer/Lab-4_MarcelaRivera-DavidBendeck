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
public class Exception_CantJCadaPosi extends Exception {
        private int cont1,cont2,cont3,cont4;

    public Exception_CantJCadaPosi(int cont1, int cont2, int cont3, int cont4) {
        super();
        this.cont1 = cont1;
        this.cont2 = cont2;
        this.cont3 = cont3;
        this.cont4 = cont4;
    }

    public int getCont1() {
        return cont1;
    }

    public void setCont1(int cont1) {
        this.cont1 = cont1;
    }

    public int getCont2() {
        return cont2;
    }

    public void setCont2(int cont2) {
        this.cont2 = cont2;
    }

    public int getCont3() {
        return cont3;
    }

    public void setCont3(int cont3) {
        this.cont3 = cont3;
    }

    public int getCont4() {
        return cont4;
    }

    public void setCont4(int cont4) {
        this.cont4 = cont4;
    }

    @Override
    public String toString() {
        return "Exception_CantJCadaPosi{" + "cont1=" + cont1 + ", cont2=" + cont2 + ", cont3=" + cont3 + ", cont4=" + cont4 + '}';
    }
    
    

        
}
