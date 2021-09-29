/**
 * Esta clase es heredada de combatientes y posee las caracteristicas del explorador
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Explorador extends Combatientes {
    
    //objeto combatientes tipo explorador
    Combatientes explorador = new Combatientes();

    /**
    * metodo donde se colocan todas las caracteristicas del explorador
    */
    public void Explorador(){
        explorador.setNombre("Explorador");
        explorador.setVida(100);
        explorador.setPoder(15);
        explorador.setItem(5);

        System.out.println("\nNombre: "+explorador.getNombre());
        System.out.println("Vidas: "+explorador.getVida());
        System.out.println("Poder: "+explorador.getPoder());
        System.out.println("Item (Agregar Vidas): "+explorador.getItem());
    }
}
