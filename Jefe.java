public class Jefe extends Combatientes {
    
    protected int habilidadE1;
    protected int habilidadE2;


    public Jefe(String nombre, int vidas, int poder, int habilidadE1, int habilidadE2){
        super(nombre, vidas, poder);
        this.habilidadE1 = habilidadE1;
        this.habilidadE2 = habilidadE2;
    }

    public void setJefe(){
        String nombre = "Ultron";
        int vidas = 120;
        int poder = 35;
        int habilidadE = 40;
        return;
    }
}
