import java.util.Random;

public class Enemigos extends Combatientes {

    Random rand = new Random();

    Combatientes enemigo1 = new Combatientes();

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