/**
 * Esta clase es la vista donde se muestran mensajes con impresiones
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

import java.util.Scanner;

public class Vista {
    
    //Objeto tipo scanner
    Scanner sn = new Scanner(System.in);
    //Objeto tipo enemigo
    Enemigos enemigos = new Enemigos();
    //Objeto tipo jefe
    Jefe jefes = new Jefe();
    //Objeto tipo guerrero
    Guerrero guerreros = new Guerrero();
    //Objeto tipo explorador
    Explorador exploradores = new Explorador();
    
    /**
     * Texto del primer menu
    */
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

    /**
     * Texto del tercer menu
    */
    public int menu3(){
        int opcion3;

        String menu3 = "1. Atacar\n" +
                       "2. Recuperar Vida\n";
        
        System.out.println(menu3);
        opcion3 =  sn.nextInt();
               
        return opcion3;

    }

    /**
     * Texto del menu para elegir personajes
    */
    public int personaje(){
        int opcion2;

        String personaje = "\nElija un personajes\n" +
                        "1. Guerrero\n" +
                        "2. Explorador\n";
        
        System.out.println(personaje);
        opcion2 = sn.nextInt();

        return opcion2;
    }

    /**
     * Crea e imprime un enemigo
    */
    public void enemigo1(){
        enemigos.Enemigos();
    }


    /**
     * Crea e imprime un jefe
    */
    public void jefe(){
        jefes.Jefe();
    }

    /**
     * Crea e imprime un guerrero
    */
    public void guerrero(){
        guerreros.Guerrero();
    }

    /**
     * Crea e imprime un explorador
    */
    public void explorador(){
        exploradores.Explorador();
    }

    /**
     * Crea e imprime el mensaje de despedida
    */
    public String salir(){
        String salir = "\nFin del Juego\n";
        System.out.println(salir);
        return salir;
    }

}
