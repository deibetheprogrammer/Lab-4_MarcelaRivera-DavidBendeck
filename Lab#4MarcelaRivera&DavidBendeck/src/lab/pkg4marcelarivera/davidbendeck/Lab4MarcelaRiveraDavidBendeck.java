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

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.CRUD Equipo\n2.CRUE Jugadores\n3.Simulacion\n4.Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    break;
                case 2:
                    System.out.println("1.Agregar CRUD\n2.Modificar CRUD\n3.Eliminar CRUD\nListar\nVer STATS de un jugador");
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    static String casa = "";
    static int partidos_ganados,partidos_perdidos;

    public static void llenar() {
        System.out.println("1.Gryffindor\n2.Slytherin\n3.Ravenclaw\n4.Hufflepuff");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                casa = "Gryffindor";
                break;
            case 2:
                casa = "Slytherin";
                break;
            case 3:
                casa = "Ravenclaw";
                break;
            case 4:
                casa = "Hufflepuff";
                break;

        }
        System.out.println("Cantidad de partidos ganados: ");
        partidos_ganados=leer.nextInt();
        System.out.println("Cantidad dde partidos perdidos: ");
        partidos_perdidos=leer.nextInt();
        
    }
    static String nombre,casa_jugador;
    static int año,n_uniforme;
    public static void jugadores(){
        System.out.println("Nombre: ");
        nombre=leer.next();
        System.out.println("Casa a la que pertnece:\n1.Gryffindor\n2.Slytherin\n3.Ravenclaw\n4.Hufflepuff");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                casa_jugador = "Gryffindor";
                break;
            case 2:
                casa_jugador = "Slytherin";
                break;
            case 3:
                casa_jugador = "Ravenclaw";
                break;
            case 4:
                casa_jugador = "Hufflepuff";
                break;       
        }
        System.out.println("Año que cruza:");
        año=leer.nextInt();
        
        
    }
}
