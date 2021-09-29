import java.util.Random;

public class Enemigos extends Combatientes {

    Random rand = new Random();
    protected int habilidadE;

    public Enemigos(String nombre, int vidas, int poder, int habilidadE){
        super(nombre, vidas, poder);
        this.habilidadE = habilidadE;
    }

    

    public String setNombreE(){
        String Nom;
        String[] nombres = new String[] {"Loki", "Kang", "Killmonger"};
        //Varible que indica que elija uno al azar entre los 3 elementos de la lista
        int cantidad = rand.nextInt(3);
        //Variable que indica la edad que se escogio al azar
        Nom = nombres [cantidad];
        System.out.println("Edad (años): " +Nom);
        return Nom;
    }

    public void setEnemigo2(){
        String nombre = "Kang";
        int vidas = 100;
        int poder = 20;
        int habilidadE = 5;
        return;
        int vidas = 100;
        int poder = 25;
        int habilidadE = 5;
    }

    public void getEnemigo2(){
        System.out.println("Enemigo 2: " +nombre);
        System.out.println("Vidas: " +vidas);
        System.out.println("Poder: " +poder);
        System.out.println("Habilidad Especial: " +habilidadE);
    }

}