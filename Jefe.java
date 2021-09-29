import java.util.Random;

public class Jefe extends Combatientes {
    
    Random rand = new Random();
    
    Combatientes jefe = new Combatientes();

    public void Jefe(){
        jefe.setNombre("Jefe");
        jefe.setVida(120);
        jefe.setPoder(40);
        jefe.sethabilidad1(20);
        jefe.sethabilidad2(60);

        System.out.println("\nNombre: "+jefe.getNombre());
        System.out.println("Vidas: "+jefe.getVida());
        System.out.println("Poder: "+jefe.getPoder());
        System.out.println("Habilidad especial (Agregar Vidas): "+jefe.gethabilidad1());
        System.out.println("Habilidad especial (Agregar Vidas): "+jefe.gethabilidad2());
    }

    

	/** 
	@Override
	public int atacar() {
		//Posibilidad de recuperar vida en turno de aque
		recuperarVida();
		return super.atacar();
	}
	
	@Override
	public int defender() {
		//Posibilidad de recuperar vida en turno de defensa
		recuperarVida();
		return super.defender();
	}*/

}

