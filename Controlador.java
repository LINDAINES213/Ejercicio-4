

public class Controlador {

    public static void main(String[] args){
    
        Vista vista = new Vista();

        int opcion = 0;
        int opcion2 = 0;

        while(opcion != 3){

            opcion = vista.menu1();

            if(opcion == 1){

                opcion2 = vista.personaje();

            } else if (opcion == 2){

                vista.enemigo1();
                vista.enemigo2();
                vista.jefe();
                vista.guerrero();
                vista.explorador();

            } else if (opcion == 3){

                vista.salir();

            }
        }
    }
}
