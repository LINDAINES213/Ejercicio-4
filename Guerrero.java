/**
 * Esta clase es heredada de combatientes y posee las caracteristicas del guerrero
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Guerrero extends Combatientes {
    
    //objeto combatientes tipo guerrero
    Combatientes guerrero = new Combatientes();

    /**
    * metodo donde se colocan todas las caracteristicas del guerrero
    */
    public void Guerrero(){
        guerrero.setNombre("Guerrero");
        guerrero.setVida(100);
        guerrero.setPoder(30);
        guerrero.setItem(10);

        System.out.println("\nNombre: "+guerrero.getNombre());
        System.out.println("Vidas: "+guerrero.getVida());
        System.out.println("Poder: "+guerrero.getPoder());
        System.out.println("Item (Agregar Vidas): "+guerrero.getItem());
        return;
    }
}
