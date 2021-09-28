

public class Enemigos extends Combatientes {

    protected int habilidadE;

    public Enemigos(String nombre, int vidas, int poder, int habilidadE){
        super(nombre, vidas, poder);
        this.habilidadE = habilidadE;
    }

    public void setEnemigo1(){
        String nombre = "Ultron";
        int vidas = 100;
        int poder = 20;
        int habilidadE = 40;
        return;
    }

    public void getEnemigo1(){
        System.out.println("Enemigo 1: " +nombre);
        System.out.println("Vidas: " +vidas);
        System.out.println("Poder: " +poder);
        System.out.println("Habilidad Especial: " +habilidadE);
    }

    public void setEnemigo2(){
        String nombre = "Soldado del Invierno";
        int vidas = 10;
        String poder = "Disparar";
        String habilidadE = "Super golpe";
        return;
    }

    public void getEnemigo2(){
        System.out.println("Enemigo 2: " +nombre);
        System.out.println("Vidas: " +vidas);
        System.out.println("Poder: " +poder);
        System.out.println("Habilidad Especial: " +habilidadE);
    }

}