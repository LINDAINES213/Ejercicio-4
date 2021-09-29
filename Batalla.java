
public class Batalla{

    int vidan;
    Guerrero guerrero = new Guerrero();
    Explorador explorador = new Explorador();
    Enemigos enemigo1 = new Enemigos();
    Jefe jefes = new Jefe();

    do{
        vidan = enemigo1.ataque();
        System.out.println(enemigo1.getNombre()+ "hizo un ataque de: " +vidan);
        guerrero.dano(vidan);
    } while (guerrero.getVida > 0 && enemigo1.getVida > 0);
        
}