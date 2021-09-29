/**
 * Esta clase lleva las acciones que se llevan a cabo en la batalla
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Batalla{
    int nvidas;
    Guerrero guerrero = new Guerrero();
    Explorador exploradores = new Explorador();
    Enemigos enemigo1 = new Enemigos();
    Jefe jefes = new Jefe();

    /**
     * Metodo con acciones para atacar al guerrero
     */
    public void atAguerrero(){
        while(guerrero.getVida()>0){
            nvidas = enemigo1.ataque();
            System.out.println(enemigo1.getNombre()+ " hizo un ataque de: " +nvidas);
            guerrero.dano(nvidas);
        }
    }

    /**
     * Metodo con acciones para atacar al enemigo
     */
    public void atAenemigo(){
        while(enemigo1.getVida()>0){
            nvidas = guerrero.ataque();
            System.out.println(guerrero.getNombre()+ " hizo un ataque de: " +nvidas);
            enemigo1.dano(nvidas);
        }
    }
    
    
}
   
        
