/**
 * Esta clase es heredada de combatientes y posee las caracteristicas de los enemigos
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Enemigos extends Combatientes {

    //objeto combatientes tipo enemigo1
    Combatientes enemigo1 = new Combatientes();


    /**
    * metodo donde se colocan todas las caracteristicas del enemigo
    */
    public void Enemigos(){
        enemigo1.setNombre("Enemigo");
        enemigo1.setVida(110);
        enemigo1.setPoder(30);
        enemigo1.sethabilidad1(15);

        System.out.println("\nNombre: "+enemigo1.getNombre());
        System.out.println("Vidas: "+enemigo1.getVida());
        System.out.println("Poder: "+enemigo1.getPoder());
        System.out.println("Habilidad especial (Agregar Vidas): "+enemigo1.gethabilidad1());
    }

   
   
}