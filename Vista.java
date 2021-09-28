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

        String menu1 = "Bienvenido al juego. Elija una opción:\n" +
                       "1. Simulador de Juego\n" +
                       "2. Ver personajes disponibles\n" +
                       "3. Salir del Juego\n";
        
        System.out.println(menu1);
        opcion =  sn.nextInt();
               
        return opcion;

    }

    public int personaje(){
        int opcion2;

        String personaje = "Elija una pareja de personajes\n" +
                        "1. Enemigo Jefe vs Guerrero\n" +
                        "2. Enemigo Jefe vs Explorador\n" +
                        "3. Enemigo normal vs Guerrero\n" +
                        "1. Enemigo normal vs Explorador\n" +
                        "2. Enemigo Jefe vs Enemigo normal\n" +
                        "3. Explorador vs Guerrero\n";
        
        System.out.println(personaje);
        opcion2 = sn.nextInt();

        return opcion2;
    }

    public void enemigo1(){
        enemigos.getEnemigo1();
    }

    public String salir(){
        String salir = "\nFin del Juego\n";
        System.out.println(salir);
        return salir;
    }

}
