

public class Controlador {

    public static void main(String[] args){
    
        Vista vista = new Vista();
        Batalla batalla = new Batalla();
        Enemigos enemigo;

        int opcion = 0;
        int opcion2 = 0;

        while(opcion != 3){

            opcion = vista.menu1();

            if(opcion == 1){

                opcion2 = vista.personaje();
                
                if(opcion2 == 1){
                    vista.guerrero();
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
