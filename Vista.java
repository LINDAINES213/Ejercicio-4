/**
 * Esta clase es la vista del programa, donde imprime toda la informacion requerida
 * @author: Linda Ines Jimenez Vides
 * @version: 17 - septiembre - 2021
 */

import java.util.Scanner;

public class Vista {
    
    Scanner sn = new Scanner(System.in);
    Enemigos enemigos = new Enemigos();
    Jefe jefes = new Jefe();
    Guerrero guerreros = new Guerrero();
    Explorador exploradores = new Explorador();
    

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

    public int menu3(){
        int opcion3;

        String menu3 = "1. Atacar\n" +
                       "2. Recuperar Vida\n";
        
        System.out.println(menu3);
        opcion3 =  sn.nextInt();
               
        return opcion3;

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
        enemigos.Enemigos();
    }


    public void jefe(){
        jefes.Jefe();
    }

    public void guerrero(){
        guerreros.Guerrero();
    }

    public void explorador(){
        exploradores.Explorador();
    }

    public String salir(){
        String salir = "\nFin del Juego\n";
        System.out.println(salir);
        return salir;
    }

}
