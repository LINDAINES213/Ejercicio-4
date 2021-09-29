public class Guerrero extends Combatientes {
    
    protected int habilidadE;

    public Guerrero(String nombre, int vidas, int poder, int habilidadE){
        super(nombre, vidas, poder);
        this.habilidadE = habilidadE;
    }
}
