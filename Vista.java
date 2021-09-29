/**
 * Esta clase es la vista del programa, donde imprime toda la informacion requerida
 * @author: Linda Ines Jimenez Vides
 * @version: 17 - septiembre - 2021
 */

import java.util.Scanner;

public class Vista {
    
    Scanner sn = new Scanner(System.in);
    Enemigos enemigos;
    

    public int menu1(){
        int opcion;

        String menu1 = "\nBienvenido al juego. Elija una opción:\n" +
                       "1. Simulador de Juego\n" +
                       "2. Ver personajes disponibles\n" +
                       "3. Salir del Juego\n";
        
        System.out.println(menu1);
        opcion =  sn.nextInt();
               
        return opcion;

    }

    public int personaje(){
        int opcion2;

        String personaje = "\nElija un personajes\n" +
                        "1. Guerrero\n" +
                        "2. Explorador\n";
        
        System.out.println(personaje);
        opcion2 = sn.nextInt();

        return opcion2;
    }

    public void enemigo1(){
            System.out.println("\nEnemigo 1: Loki");
            System.out.println("Puntos de Vida: 100");
            System.out.println("Poder de Ataque: Rayo de energía (25)");
            System.out.println("Habilidad especial: Resistencia (+5 vida)");
    }

    public void enemigo2(){
        System.out.println("\nEnemigo 2: Kang");
        System.out.println("Puntos de Vida: 100");
        System.out.println("Poder de Ataque: Proyeccion de energia (20)");
        System.out.println("Habilidad especial: Resistencia (+5 vida)");
    }

    public void jefe(){
        System.out.println("\nJefe: Ultron");
        System.out.println("Puntos de Vida: 120");
        System.out.println("Poder de Ataque: Distraccion (35)");
        System.out.println("Habilidad especial: Teletransportacion (+40 vida)");
    }

    public void guerrero(){
        System.out.println("\nGuerrero: Iron man");
        System.out.println("Puntos de Vida: 100");
        System.out.println("Poder de Ataque: Proyeccion de energia (20)");
        System.out.println("Habilidad especial: Teletransportacion (+ vida)");
    }

    public void explorador(){
        System.out.println("\nExplorador: Ant man");
        System.out.println("Puntos de Vida: 100");
        System.out.println("Poder de Ataque: Proyeccion de energia");
        System.out.println("Habilidad especial: Resistencia (+vida)");
    }

    public String salir(){
        String salir = "\nFin del Juego\n";
        System.out.println(salir);
        return salir;
    }

}
