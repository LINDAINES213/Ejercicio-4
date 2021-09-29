public class Explorador extends Combatientes {
    
    protected int habilidadE;

    public Explorador(String nombre, int vidas, int poder, int habilidadE){
        super(nombre, vidas, poder);
        this.habilidadE = habilidadE;
    }
}
