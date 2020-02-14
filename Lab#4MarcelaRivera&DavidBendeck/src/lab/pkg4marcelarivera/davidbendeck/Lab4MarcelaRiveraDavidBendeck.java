/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidbendeck
 */
public class Lab4MarcelaRiveraDavidBendeck {

    static Scanner leer = new Scanner(System.in);
    static String vs,casa,nombre;
    static int anio;

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
                            casa = leer.nextLine();
                            
                            try {
                                equipos.add(new Equipo(casa));
                            } catch (Exception_Casas ex) {
                                Logger.getLogger(Lab4MarcelaRiveraDavidBendeck.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            break;

                        case 2:
                            int cont=0;
                            for (Equipo i : equipos) {
                                System.out.println(cont+" "+i); 
                                cont++;
                            }
                            System.out.println("Ingrese la posicion del equipo que desea modificar: ");
                            int posi=leer.nextInt();
                            modificar(posi);
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
                            casa = leer.nextLine();
                            
                            System.out.println("Ingrese el nombre: ");
                            nombre = leer.nextLine();
                            
                            System.out.println("Ingrese el año: ");
                            anio = leer.nextInt();
                            vs = leer.nextLine();
                            
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

   static ArrayList<Equipo> equipos=new ArrayList();

    

    
    
    
    public static void modificar(int posi){
    
                System.out.println("1.Modificar casa\n2.Modificar Capitan\n3.Modificar un jugador");
                int sp=leer.nextInt();
                switch(sp){
                    case 1:
                        System.out.println("Ingrese la casa (Gryffindor, Slytherin, Ravenclaw, Hufflepuff)");
                casa = leer.nextLine();
                (equipos.get(posi)).setCasa(casa);
                        break;
                    case 2:
                        if ((equipos.get(posi)).getJugadores().size()>0){
                            int cont=0;
                            for (Object i : (equipos.get(posi).getJugadores())) {
                                System.out.println(cont +" "+i);
                                cont++;
                            }
                            System.out.println("Ingrese la posicion en la que se encuentra: ");
                            int possi=leer.nextInt();
                            (equipos.get(posi)).setCapitan((equipos.get(posi)).getJugadores().get(possi));
                        }else{
                            System.out.println("No tenes jugadores prro");
                        }
                        break;
                    case 3:
                         int cont=0;
                            for (Object i : (equipos.get(posi).getJugadores())) {
                                System.out.println(cont +" "+i);
                                cont++;
                            }
                            System.out.println("Ingrese la posicion en la que se encuentra: ");
                            int possi=leer.nextInt();
                            System.out.println("1.Modificar nombre\n2.Modificar año que se encuntra\n");
                            int p=leer.nextInt();
                            switch(p){
                                case 1:
                                    System.out.println("Nuevo nombre: ");
                                    nombre=leer.next();
                                    (equipos.get(posi)).getJugadores().get(possi).setNombre(nombre);
                                    break;
                                case 2:
                                    System.out.println("Nuevo Año: ");
                                    anio=leer.nextInt();
                                    (equipos.get(posi)).getJugadores().get(possi).setAnio(anio);
                                    break;
                            }
                        break;
                       
                }
    }
    
    
    
}
