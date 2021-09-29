import java.util.Random;

public class Guerrero extends Combatientes {
    
    Random rand = new Random();

    Combatientes guerrero = new Combatientes();

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
