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
                    System.out.print("CRUD equipo:\n"
                            + "1) Agregar equipo\n"
                            + "2) Modificar equipo\n"
                            + "3) Eliminar equipo\n"
                            + "4) Listar equipos\n"
                            + "Su elección:");
                    op = leer.nextInt();
                    vs = leer.nextLine();
                    
                    switch(op) {
                        case 1:
                            System.out.println("Ingrese la casa (Gryffindor, Slytherin, Ravenclaw, Hufflepuff)");
                            String casa = leer.nextLine();
                            
                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    System.out.print("CRUD jugador:\n"
                            + "1) Agregar jugador\n"
                            + "2) Modificar jugador\n"
                            + "3) Eliminar jugador\n"
                            + "4) Listar jugador\n"
                            + "Su elección:");
                    op = leer.nextInt();
                    vs = leer.nextLine();
                    
                    switch(op) {
                        case 1:
                            System.out.println("Ingrese la casa (Gryffindor, Slytherin, Ravenclaw, Hufflepuff)");
                            String casa = leer.nextLine();
                            
                            System.out.println("Ingrese el nombre: ");
                            String nombre = leer.nextLine();
                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
      
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
