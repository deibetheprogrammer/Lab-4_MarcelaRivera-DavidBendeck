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
public class Buscador extends Jugador{

    private double peso,velocidad;

    public Buscador(double peso, String nombre, int anio, String casa) {
        super(nombre, anio, casa);
        this.peso = peso;
        this.velocidad = (200/peso)*7;
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

    @Override
    public String toString() {
        return "Buscador{" + "peso=" + peso + ", velocidad=" + velocidad + '}';
    }

    @Override
    public boolean modoDeJuego(double valor, boolean opcion) {
        if (velocidad/14 + 14 > valor) {
            System.out.printf("%s(%d - %s) Ha intentado capturar la snitch dorada: exitosamente%n",nombre,numero,casa);
            return false;
        } else {
            System.out.printf("%s(%d - %s) Ha intentado capturar la snitch dorada: falló%n",nombre,numero,casa);
            return false;
        }
    }

    @Override
    public boolean trampa() {
        if (rand.nextInt(100) <= 5) {
            System.out.printf("%s(%d - %s) Ha intentado hacer trampa: exitosamente%n",nombre,numero,casa);
            return true;
        } else {
            System.out.printf("%s(%d - %s) Ha intentado hacer trampa: falló%n",nombre,numero,casa);
            return false;
        }
    }
   
    
}
