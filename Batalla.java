
public class Batalla{
    int nvidas;
    Guerrero guerrero = new Guerrero();
    Explorador exploradores = new Explorador();
    Enemigos enemigo1 = new Enemigos();
    Jefe jefes = new Jefe();

    public void atAguerrero(){
        while(guerrero.getVida()>0){
            nvidas = enemigo1.ataque();
            System.out.println(enemigo1.getNombre()+ " hizo un ataque de: " +nvidas);
            guerrero.dano(nvidas);
        }
    }

    public void atAenemigo(){
        while(enemigo1.getVida()>0){
            nvidas = guerrero.ataque();
            System.out.println(guerrero.getNombre()+ " hizo un ataque de: " +nvidas);
            enemigo1.dano(nvidas);
        }
    }
    
    
}
   
        
