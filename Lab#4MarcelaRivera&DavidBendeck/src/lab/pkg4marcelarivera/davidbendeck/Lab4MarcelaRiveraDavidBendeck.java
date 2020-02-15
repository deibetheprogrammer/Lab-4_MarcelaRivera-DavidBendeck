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
    static String vs, casa, nombre;
    static int anio,cont1=0,cont2=0,cont3=0,cont4=0;
    static ArrayList<Equipo> equipos = new ArrayList();

    public static void main(String[] args) throws Exception_JCasas, Exception_CantJu,Exception_CantJCadaPosi {
      /* equipos.add(new Equipo());
       equipos.get(0).setCasa("gryffindor");
       equipos.get(0).getJugadores().add(new Guardian(7,"Pablo", 4, "gryffindor"));
       equipos.get(0).getJugadores().add(new Buscador(100.8,"juana", 2, "gryffindor"));
       equipos.get(0).getJugadores().add(new Cazadores(150.3,"pedra", 6, "gryffindor"));
       equipos.get(0).getJugadores().add(new Golpeador("Petronila", 4, "gryffindor"));
       equipos.add(new Equipo());
       equipos.get(1).setCasa("slytherin");
       equipos.get(1).getJugadores().add(new Guardian(7,"Pabla", 7, "slytherin"));
       equipos.get(1).getJugadores().add(new Buscador(103.8,"juano", 1, "slytherin"));
       equipos.get(1).getJugadores().add(new Cazadores(130.3,"pedro", 2, "slytherin"));
       equipos.get(1).getJugadores().add(new Golpeador("Petronilooo", 6, "slytherin"));        
       */

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
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese la casa (Gryffindor, Slytherin, Ravenclaw, Hufflepuff)");
                            casa = leer.nextLine();
                            casa.toLowerCase();
                            try {
                                equipos.add(new Equipo(casa));
                            } catch (Exception_Casas ex) {
                                Logger.getLogger(Lab4MarcelaRiveraDavidBendeck.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            break;

                        case 2:
                            int cont = 0;
                            for (Equipo i : equipos) {
                                System.out.println(cont + " " + i);
                                cont++;
                            }
                            System.out.println("Ingrese la posicion del equipo que desea modificar: ");
                            int posi = leer.nextInt();
                            modificar(posi);
                            break;
                        case 3:
                            cont = 0;
                            for (Equipo i : equipos) {
                                System.out.println(cont + " " + i);
                                cont++;
                            }
                            System.out.println("Ingrese la posicion del equipo que desea eliminar: ");
                            posi = leer.nextInt();
                            equipos.remove(posi);
                            break;
                        case 4:
                            cont = 0;
                            for (Equipo i : equipos) {
                                System.out.println(cont + " " + i);
                                cont++;
                            }
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
                    int cont = 0;
                    for (Equipo i : equipos) {
                        System.out.println(cont + " " + i);
                        cont++;
                    }
                    System.out.println("Ingrese la posicion del equipo: ");
                    int posi = leer.nextInt();
                    cont1=0;
                    cont2=0;
                    cont3=0;
                    cont4=0;
                    for (Object i : (equipos.get(posi).getJugadores())) {
                        if (i instanceof Guardian){
                            cont1++;
                        }else if (i instanceof Cazadores){
                            cont2++;
                        }else if (i instanceof Buscador){
                            cont3++;
                        }else if (i instanceof Golpeador){
                            cont4++;
                        }  
                    }
                    switch (op) {
                        case 1:
                            if ((equipos.get(posi)).getJugadores().size() >= 7) {
                                
                                throw new Exception_CantJu((equipos.get(posi)).getJugadores().size());
                            } else {
                                System.out.println("Ingrese la casa (Gryffindor, Slytherin, Ravenclaw, Hufflepuff)");
                                casa = leer.nextLine();
                                if ((equipos.get(posi).getCasa()).equals(casa)) {
                                    System.out.println("Ingrese el nombre: ");
                                    nombre = leer.nextLine();
                                    System.out.println("Ingrese el año: ");
                                    anio = leer.nextInt();
                                    vs = leer.nextLine();
                                    System.out.println("1.Guardian\n2.Cazador\n3.Buscador\n4.Golpeador");
                                    int p = leer.nextInt();
                                    switch (p) {
                                        case 1:
                                            System.out.println("Cuantos reflejos tiene su jugador: ");
                                            double reflejos = leer.nextDouble();
                                            if (cont1>0){
                                              System.out.println("Ya ingreso esta posicion");
                                                throw new Exception_CantJCadaPosi(cont1, cont2, cont3, cont4);
                                            }else{
                                            cont1++;
                                            (equipos.get(posi)).getJugadores().add(new Guardian(reflejos, nombre, anio, casa));    
                                            }
                                            
                                            
                                            break;
                                        case 2:
                                            System.out.println("Cual es el peso tiene su jugador: ");
                                            double peso = leer.nextDouble();
                                             if (cont2>0){
                                                 System.out.println("Ya ingreso esta posicion");

                                                throw new Exception_CantJCadaPosi(cont1, cont2, cont3, cont4);
                                            }else{
                                            cont2++;
                                            (equipos.get(posi)).getJugadores().add(new Cazadores(peso, nombre, anio, casa));     
                                             }
                                            
                                            break;
                                        case 3:
                                            System.out.println("Cual es el peso tiene su jugador: ");        
                                            peso = leer.nextDouble();
                                            if (cont3>0){
                                                System.out.println("Ya ingreso esta posicion");
                                                throw new Exception_CantJCadaPosi(cont1, cont2, cont3, cont4);
                                            }else{
                                            cont3++;
                                            (equipos.get(posi)).getJugadores().add(new Buscador(peso, nombre, anio, casa));    
                                            }
                                            break;
                                        case 4:
                                            if (cont4>0){
                                                System.out.println("Ya ingreso esta posicion");
                                                throw new Exception_CantJCadaPosi(cont1, cont2, cont3, cont4);
                                            }else{
                                            cont4++;
                                            (equipos.get(posi)).getJugadores().add(new Golpeador(nombre, anio, casa));
     
                                            }
                                        break;

                                    }
                                } else {
                                    throw new Exception_JCasas((equipos.get(posi).getCasa()), casa);
                                }
                            }
                            break;
                        case 2:
                            cont = 0;
                            for (Object i : (equipos.get(posi).getJugadores())) {
                                System.out.println(cont + " " + i);
                                cont++;
                            }
                            System.out.println("Ingrese la posicion en la que se encuentra: ");
                            int possi = leer.nextInt();
                            System.out.println("1.Modificar nombre\n2.Modificar año que se encuntra\n");
                            int p = leer.nextInt();
                            switch (p) {
                                case 1:
                                    System.out.println("Nuevo nombre: ");
                                    nombre = leer.next();
                                    nombre = leer.next();
                                    (equipos.get(posi)).getJugadores().get(possi).setNombre(nombre);
                                    break;
                                case 2:
                                    System.out.println("Nuevo Año: ");
                                    anio = leer.nextInt();
                                    (equipos.get(posi)).getJugadores().get(possi).setAnio(anio);
                                    break;
                            }
                            break;
                        case 3:
                            cont = 0;
                            for (Object i : (equipos.get(posi).getJugadores())) {
                                System.out.println(cont + " " + i);
                                cont++;
                            }
                            System.out.println("Ingrese la posicion en la que se encuentra: ");
                            possi = leer.nextInt();

                            (equipos.get(posi)).getJugadores().remove(possi);
                            break;
                        case 4:
                            break;
                    }

                    break;
                case 3:

                    cont = 0;
                    for (Object i : equipos) {
                        System.out.println(cont + " " + i);
                        cont++;
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void modificar(int posi) {
        System.out.println("1.Modificar casa\n2.Modificar Capitan\n3.Modificar un jugador");
        int sp = leer.nextInt();
        switch (sp) {
            case 1:
                System.out.println("Ingrese la casa (Gryffindor, Slytherin, Ravenclaw, Hufflepuff)");
                casa = leer.nextLine();
                (equipos.get(posi)).setCasa(casa);
                break;
            case 2:
                if ((equipos.get(posi)).getJugadores().size() > 0) {
                    int cont = 0;
                    for (Object i : (equipos.get(posi).getJugadores())) {
                        System.out.println(cont + " " + i);
                        cont++;
                    }
                    System.out.println("Ingrese la posicion en la que se encuentra: ");
                    int possi = leer.nextInt();
                    (equipos.get(posi)).setCapitan((equipos.get(posi)).getJugadores().get(possi));
                } else {
                    System.out.println("No tenes jugadores prro");
                }
                break;
            case 3:
                int cont = 0;
                for (Object i : (equipos.get(posi).getJugadores())) {
                    System.out.println(cont + " " + i);
                    cont++;
                }
                System.out.println("Ingrese la posicion en la que se encuentra: ");
                int possi = leer.nextInt();
                System.out.println("1.Modificar nombre\n2.Modificar año que se encuntra\n");
                int p = leer.nextInt();
                switch (p) {
                    case 1:
                        System.out.println("Nuevo nombre: ");
                        nombre = leer.next();
                        nombre = leer.next();
                        (equipos.get(posi)).getJugadores().get(possi).setNombre(nombre);
                        break;
                    case 2:
                        System.out.println("Nuevo Año: ");
                        anio = leer.nextInt();
                        (equipos.get(posi)).getJugadores().get(possi).setAnio(anio);
                        break;
                }
                break;

        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void jugar() throws Exception_CantJu {
        int cont = 0;
        for (Equipo equipo : equipos) {
            System.out.println(cont + " " + equipo.getCasa());
            cont++;
        }
        System.out.println("Ingrese la posicion de la casa que desea jugar: ");
        int posi = leer.nextInt();
        System.out.println("Ingrese la posicion de la casa contra la que desea jugar: ");
        int poso = leer.nextInt();
        if ((equipos.get(posi)).getJugadores().size() != 7) {
            throw new Exception_CantJu((equipos.get(posi)).getJugadores().size());
        } else {
            while (true) {
                cont = 0;
                for (int i = 0; i < (equipos.get(posi)).getJugadores().size(); i++) {
                    System.out.println(cont + " " + (equipos.get(posi)).getJugadores().get(i).getNombre());
                    cont++;
                }
                System.out.println("Con cual jugador desea jugar(ingrese su posicion)");
                int o = leer.nextInt();
                System.out.println("1.Jugar normal\n2.Hacer trampa");
                int p = leer.nextInt();
                switch (p) {
                    case 1:
                        if ((equipos.get(posi).getJugadores().get(o).getCasa()).equals("gryffindor")) {

                        } else if ((equipos.get(posi).getJugadores().get(o).getCasa()).equals("slytherin")) {

                        } else if ((equipos.get(posi).getJugadores().get(o).getCasa()).equals("ravenclaw")) {

                        } else if ((equipos.get(posi).getJugadores().get(o).getCasa()).equals("hufflepuff")) {

                        }
                        System.out.println();

                        break;

                    case 2:
                        if ((equipos.get(posi).getJugadores().get(o).getCasa()).equals("gryffindor")) {

                        } else if ((equipos.get(posi).getJugadores().get(o).getCasa()).equals("slytherin")) {

                        } else if ((equipos.get(posi).getJugadores().get(o).getCasa()).equals("ravenclaw")) {

                        } else if ((equipos.get(posi).getJugadores().get(o).getCasa()).equals("hufflepuff")) {

                        }
                        break;

                }

            }

        }
    }

}
