import java.util.Random;

public class Explorador extends Combatientes {
    
    Random rand = new Random();

    Combatientes explorador = new Combatientes();

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
