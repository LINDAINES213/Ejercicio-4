/**
 * Esta clase es heredada de combatientes y posee las caracteristicas del jefe
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Jefe extends Combatientes {
    
    //objeto combatientes tipo jefe
    Combatientes jefe = new Combatientes();

    /**
    * metodo donde se colocan todas las caracteristicas del jefe
    */
    public void Jefe(){
        jefe.setNombre("Jefe");
        jefe.setVida(120);
        jefe.setPoder(40);
        jefe.sethabilidad1(20);
        jefe.sethabilidad2(60);

        System.out.println("\nNombre: "+jefe.getNombre());
        System.out.println("Vidas: "+jefe.getVida());
        System.out.println("Poder: "+jefe.getPoder());
        System.out.println("Habilidad especial (Agregar Vidas): "+jefe.gethabilidad1());
        System.out.println("Habilidad especial (Agregar Vidas): "+jefe.gethabilidad2());
    }
}