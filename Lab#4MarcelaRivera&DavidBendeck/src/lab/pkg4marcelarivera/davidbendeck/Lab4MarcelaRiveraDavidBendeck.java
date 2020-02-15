/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4marcelarivera.davidbendeck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
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
    static int anio, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
    static ArrayList<Equipo> equipos = new ArrayList();

    public static void main(String[] args) throws Exception_JCasas, Exception_CantJu, Exception_CantJCadaPosi {
       equipos.add(new Equipo());
       equipos.get(0).setCasa("gryffindor");
       equipos.get(0).getJugadores().add(new Guardian(7,"Pablo", 4, "gryffindor"));
       equipos.get(0).getJugadores().add(new Buscador(100.8,"juana", 2, "gryffindor"));
       equipos.get(0).getJugadores().add(new Cazadores(150.3,"pedra", 6, "gryffindor"));
       equipos.get(0).getJugadores().add(new Cazadores(156.3,"KK", 3, "gryffindor"));
       equipos.get(0).getJugadores().add(new Cazadores(122.2,"benkk", 1, "gryffindor"));
       equipos.get(0).getJugadores().add(new Golpeador("Petronila", 4, "gryffindor"));
       equipos.get(0).getJugadores().add(new Golpeador("Patricio", 3, "gryffindor"));

       equipos.add(new Equipo());
       equipos.get(1).setCasa("slytherin");
       equipos.get(1).getJugadores().add(new Guardian(7,"Pabla", 7, "slytherin"));
       equipos.get(1).getJugadores().add(new Buscador(103.8,"juano", 1, "slytherin"));
       equipos.get(1).getJugadores().add(new Cazadores(130.3,"pedro", 2, "slytherin"));
       equipos.get(1).getJugadores().add(new Cazadores(135.3,"yuda", 5, "slytherin"));
       equipos.get(1).getJugadores().add(new Cazadores(160.3,"judas", 2, "slytherin"));
       equipos.get(1).getJugadores().add(new Golpeador("Petronilooo", 6, "slytherin"));       
       equipos.get(1).getJugadores().add(new Golpeador("Elcacas", 4, "slytherin"));        

        

        while (true) {
            System.out.println("1.CRUD Equipo\n2.CRUE Jugadores\n3.Simulacion\n4.Salir\nSu eleccion:");
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
                            casa = casa.toLowerCase();
                            if (equiposExistentes(equipos).indexOf(casa) != -1) {
                                System.out.println("Equipo ya existente");
                            }
                            else {
                                try {
                                    equipos.add(new Equipo(casa));
                                } catch (Exception_Casas ex) {
                                    Logger.getLogger(Lab4MarcelaRiveraDavidBendeck.class.getName()).log(Level.SEVERE, null, ex);
                                }
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
                    vs = leer.nextLine();
                    cont1 = 0;
                    cont2 = 0;
                    cont3 = 0;
                    cont4 = 0;
                    for (Object i : (equipos.get(posi).getJugadores())) {
                        if (i instanceof Guardian) {
                            cont1++;
                        } else if (i instanceof Cazadores) {
                            cont2++;
                        } else if (i instanceof Buscador) {
                            cont3++;
                        } else if (i instanceof Golpeador) {
                            cont4++;
                        }
                    }
                    switch (op) {
                        case 1:
                            if ((equipos.get(posi)).getJugadores().size() >= 7) {

                                throw new Exception_CantJu((equipos.get(posi)).getJugadores().size());
                            } else {
                                System.out.println("Ingrese la casa (Gryffindor, Slytherin, Ravenclaw, Hufflepuff)");
                                casa = leer.nextLine().toLowerCase();
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
                                            if (cont1 > 1) {
                                                System.out.println("Ya ingreso esta posicion");
                                                throw new Exception_CantJCadaPosi(cont1, cont2, cont3, cont4);
                                            } else {
                                                cont1++;
                                                (equipos.get(posi)).getJugadores().add(new Guardian(reflejos, nombre, anio, casa));
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Cual es el peso tiene su jugador: ");
                                            double peso = leer.nextDouble();
                                            if (cont2 > 3) {
                                                System.out.println("Ya ingreso esta posicion");

                                                throw new Exception_CantJCadaPosi(cont1, cont2, cont3, cont4);
                                            } else {
                                                cont2++;
                                                (equipos.get(posi)).getJugadores().add(new Cazadores(peso, nombre, anio, casa));
                                            }

                                            break;
                                        case 3:
                                            System.out.println("Cual es el peso tiene su jugador: ");
                                            peso = leer.nextDouble();
                                            if (cont3 > 1) {
                                                System.out.println("Ya ingreso esta posicion");
                                                throw new Exception_CantJCadaPosi(cont1, cont2, cont3, cont4);
                                            } else {
                                                cont3++;
                                                (equipos.get(posi)).getJugadores().add(new Buscador(peso, nombre, anio, casa));
                                            }
                                            break;
                                        case 4:
                                            if (cont4 > 2) {
                                                System.out.println("Ya ingreso esta posicion");
                                                throw new Exception_CantJCadaPosi(cont1, cont2, cont3, cont4);
                                            } else {
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

                    jugar();
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
                casa = leer.nextLine().toLowerCase();
                if (equiposExistentes(equipos).indexOf(casa) != -1) {
                    System.out.println("El equipo de esta casa ya existe");
                } else {
                    (equipos.get(posi)).setCasa(casa);
                }
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
        Random rand = new Random();
        
        int puntosA = 0;
        int puntosB = 0;

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
        } else if ((equipos.get(poso)).getJugadores().size() != 7) {
            throw new Exception_CantJu((equipos.get(poso)).getJugadores().size());
        } else {
            ArrayList<Jugador> jugadoresJ = equipos.get(posi).getJugadores();
            ArrayList<Jugador> jugadoresC = equipos.get(poso).getJugadores();

            int noAnotarA = 0;
            int noAnotarB = 0;
            int noAtajarA = 0;
            int noAtajarB = 0;
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

                Object j1 = equipos.get(posi).getJugadores().get(o);
                if (j1 instanceof Guardian) {
                    if (p == 1) {
                        if (noAtajarA < 1) {
                            if (!((Guardian) j1).modoDeJuego(velocidadCazadores(equipos.get(poso).getJugadores()), true) == false) {
                                puntosB += 10;
                            }
                        } else {
                            System.out.println("No puede atajar");
                            puntosB += 10;
                        }
                    } else {
                        if (((Guardian) j1).trampa()) {
                            noAnotarB = 3;
                        } else {
                            noAtajarA = 3;
                        }
                    }
                } else if (j1 instanceof Golpeador) {
                    if (p == 1) {
                        boolean action;
                        System.out.print("Desea:\n"
                                + "1) Atacar\n"
                                + "2) Defender\n"
                                + "Su eleccion:");
                        int op = leer.nextInt();
                        vs = leer.nextLine();
                        if (op == 1) {
                            action = true;
                            ((Golpeador) j1).modoDeJuego(fuerzaGolpeadores(jugadoresC), action);
                        } else {
                            action = false;
                            ((Golpeador) j1).modoDeJuego(agilidadGolpeadores(jugadoresC), action);
                        }
                    } else {
                        if (((Golpeador) j1).trampa() == true) {
                            for (Jugador jugador : jugadoresJ) {
                                if (jugador instanceof Golpeador) {
                                    ((Golpeador) jugador).setAguilidad(((Golpeador) jugador).getAguilidad() + 10);

                                }
                            }
                        } else {
                            for (Jugador jugador : jugadoresJ) {
                                if (jugador instanceof Golpeador) {
                                    ((Golpeador) jugador).setAguilidad(((Golpeador) jugador).getAguilidad() - 15);
                                    ((Golpeador) jugador).setFuerza(((Golpeador) jugador).getFuerza() - 10);

                                }
                            }
                        }

                    }
                } else if (j1 instanceof Cazadores) {
                    if (p == 1) {
                        if (noAnotarA < 1) {
                            if (((Cazadores) j1).modoDeJuego(agilidadGuardian(jugadoresC), true)) {
                                puntosA += 10;
                            }
                        }
                    } else {
                        if (((Cazadores) j1).trampa()) {
                            for (Jugador jugador : jugadoresJ) {
                                if (jugador instanceof Cazadores) {
                                    ((Cazadores) jugador).setAgilidad(((Cazadores) jugador).getAgilidad() + 8);
                                    ((Cazadores) jugador).setVelocidad(((Cazadores) jugador).getVelocidad() + 5);
                                }
                            }
                        } else {
                            for (Jugador jugador : jugadoresJ) {
                                if (jugador instanceof Cazadores) {
                                    ((Cazadores) jugador).setVelocidad(3);
                                }
                            }
                        }
                    }
                }
                
                else {
                    if (p == 1) {
                        if (((Buscador)j1).modoDeJuego(velocidadBuscador(jugadoresC), true)) {
                            puntosA += 150;
                            break;
                        }
                    } else {
                        if (((Buscador)j1).trampa()) {
                            puntosA += 150;
                            break;
                        } else {
                            puntosB += 150;
                            puntosA = -1;
                            break;
                        }
                    }
                }
                
                for (Jugador jugador : jugadoresJ) {
                    if (jugador instanceof Buscador) {
                        ((Buscador) jugador).setVelocidad(((Buscador) jugador).getVelocidad()+1);
                    }
                }
                
                //Turno de la máquina
                
                o = rand.nextInt(7);
                p = 1 + rand.nextInt(2);
                
                j1= equipos.get(poso).getJugadores().get(o);
                if (j1 instanceof Guardian) {
                    if (p == 1) {
                        if (noAtajarB < 1) {
                            if (!((Guardian) j1).modoDeJuego(velocidadCazadores(equipos.get(posi).getJugadores()), true) == false) {
                                puntosA += 10;
                            }
                        } else {
                            System.out.println("No puede atajar");
                            puntosA += 10;
                        }
                    } else {
                        if (((Guardian) j1).trampa()) {
                            noAnotarA = 3;
                        } else {
                            noAtajarB = 3;
                        }
                    }
                } else if (j1 instanceof Golpeador) {
                    if (p == 1) {
                        boolean action;
                        
                        int op = 1 + rand.nextInt(1);
                        
                        if (op == 1) {
                            action = true;
                            ((Golpeador) j1).modoDeJuego(fuerzaGolpeadores(jugadoresJ), action);
                        } else {
                            action = false;
                            ((Golpeador) j1).modoDeJuego(agilidadGolpeadores(jugadoresJ), action);
                        }
                    } else {
                        if (((Golpeador) j1).trampa() == true) {
                            for (Jugador jugador : jugadoresC) {
                                if (jugador instanceof Golpeador) {
                                    ((Golpeador) jugador).setAguilidad(((Golpeador) jugador).getAguilidad() + 10);

                                }
                            }
                        } else {
                            for (Jugador jugador : jugadoresC) {
                                if (jugador instanceof Golpeador) {
                                    ((Golpeador) jugador).setAguilidad(((Golpeador) jugador).getAguilidad() - 15);
                                    ((Golpeador) jugador).setFuerza(((Golpeador) jugador).getFuerza() - 10);

                                }
                            }
                        }

                    }
                } else if (j1 instanceof Cazadores) {
                    if (p == 1) {
                        if (noAnotarB < 3) {
                            if (((Cazadores) j1).modoDeJuego(agilidadGuardian(jugadoresJ), true)) {
                                puntosA += 10;
                            }
                        }
                    } else {
                        if (((Cazadores) j1).trampa()) {
                            for (Jugador jugador : jugadoresC) {
                                if (jugador instanceof Cazadores) {
                                    ((Cazadores) jugador).setAgilidad(((Cazadores) jugador).getAgilidad() + 8);
                                    ((Cazadores) jugador).setVelocidad(((Cazadores) jugador).getVelocidad() + 5);
                                }
                            }
                        } else {
                            for (Jugador jugador : jugadoresC) {
                                if (jugador instanceof Cazadores) {
                                    ((Cazadores) jugador).setVelocidad(3);
                                }
                            }
                        }
                    }
                }
                
                else {
                    if (p == 1) {
                        if (((Buscador)j1).modoDeJuego(velocidadBuscador(jugadoresJ), true)) {
                            puntosB += 150;
                            break;
                        }
                    } else {
                        if (((Buscador)j1).trampa()) {
                            puntosB += 150;
                            break;
                        } else {
                            puntosA += 150;
                            puntosB = -1;
                            break;
                        }
                    }
                }
                
                for (Jugador jugador : jugadoresC) {
                    if (jugador instanceof Buscador) {
                        ((Buscador) jugador).setVelocidad(((Buscador) jugador).getVelocidad()+1);
                    }
                }
                
                noAnotarA--;
                noAtajarA--;
                noAnotarB--;
                noAtajarB--;
            }
            
            if (puntosA > 0) {
                if (puntosB > 0) {
                    if (puntosA > puntosB) {
                        System.out.printf("Ha ganado %s contra %s (%d - %d)%n",equipos.get(posi).getCasa(),equipos.get(poso).getCasa(),puntosA,puntosB);
                    } else {
                        System.out.printf("Ha ganado %s contra %s (%d - %d)%n",equipos.get(poso).getCasa(),equipos.get(posi).getCasa(),puntosB,puntosA);
                    }
                } else {
                    System.out.printf("Gana %s, %s ha sido descalificado (%d - %d)%n",equipos.get(posi).getCasa(),equipos.get(poso).getCasa(),puntosA,puntosB);
                }
            } else {
                System.out.printf("Gana %s, %s ha sido descalificado (%d - %d)%n",equipos.get(poso).getCasa(),equipos.get(posi).getCasa(),puntosB,puntosA);
            }
        }
        
    }

    

    static double velocidadCazadores(ArrayList<Jugador> jugadores) {
        double velocidad = 1000000;
        for (Jugador jugador : jugadores) {
            if (jugador instanceof Cazadores) {
                if (((Cazadores) jugador).getVelocidad() < velocidad) {
                    velocidad = ((Cazadores) jugador).getVelocidad();
                }
            }
        }
        return velocidad;
    }

    static double fuerzaGolpeadores(ArrayList<Jugador> jugadores) {
        double fuerza = 0;
        for (Jugador jugador : jugadores) {
            if (jugador instanceof Golpeador) {
                fuerza += ((Golpeador) jugador).getFuerza();
            }
        }
        return fuerza;
    }

    static double agilidadGolpeadores(ArrayList<Jugador> jugadores) {
        double agilidad = 1000000;
        for (Jugador jugador : jugadores) {
            if (jugador instanceof Golpeador) {
                if (((Golpeador) jugador).getAguilidad() < agilidad) {
                    agilidad = ((Golpeador) jugador).getAguilidad();
                }
            }
        }
        return agilidad;
    }

    static double agilidadGuardian(ArrayList<Jugador> jugadores) {
        double agilidad = 0;
        for (Jugador jugador : jugadores) {
            if (jugador instanceof Guardian) {
                agilidad = ((Guardian) jugador).getHabilidad();
            }
        }
        return agilidad;
    }
    
    static double velocidadBuscador(ArrayList<Jugador> jugadores) {
        double velocidad = 0;
        for (Jugador jugador : jugadores) {
            if (jugador instanceof Buscador) {
                velocidad = ((Buscador) jugador).getVelocidad();
            }
        }
        return velocidad;
    }
    
    static String equiposExistentes(ArrayList<Equipo> equipos) {
        String casas = "";
        for (Equipo equipo : equipos) {
            casas += equipo.getCasa();
        }
        return casas;
    }

}
