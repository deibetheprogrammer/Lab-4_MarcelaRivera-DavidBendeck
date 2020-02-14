/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

import java.util.Scanner;

/**
 *
 * @author davidbendeck
 */
public class Lab4MarcelaRiveraDavidBendeck {

    static Scanner leer = new Scanner(System.in);
    static String vs;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.CRUD Equipo\n2.CRUE Jugadores\n3.Simulacion\n4.Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    
                    break;
                case 2:
      
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
