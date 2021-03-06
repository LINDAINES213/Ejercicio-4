/**
 * Esta clase es el controlador del programa el cual contiene los if del menu donde invoca los metodos para el funcionamientol del programa
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Controlador {

    public static void main(String[] args){
    
        Vista vista = new Vista();
        Batalla batalla = new Batalla();
        Enemigos enemigo;

        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;

        while(opcion != 3){

            opcion = vista.menu1();

            if(opcion == 1){

                opcion2 = vista.personaje();
                
                if(opcion2 == 1){
                    vista.guerrero();
                    vista.enemigo1();
                    opcion3 = vista.menu3();

                    if(opcion == 1){
                        batalla.atAenemigo();
                        opcion3 = vista.menu3();
                        batalla.atAguerrero();
                    }

                } else if (opcion2 == 2){
                    vista.explorador();
                }

            } else if (opcion == 2){

                vista.enemigo1();
                vista.jefe();
                vista.guerrero();
                vista.explorador();

            } else if (opcion == 3){

                vista.salir();

            }
        }
    }
}
