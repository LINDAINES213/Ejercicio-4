/**
 * Esta clase tiene los getters y setters de los combatientes
 * @author: Linda Ines Jimenez Vides
 * @version: 28 - septiembre - 2021
 */

public class Combatientes {
    
    protected int vidas;
    protected String nombre;
    protected int poder;
    protected int item;
    protected int habilidadE1;
    protected int habilidadE2;


	public void setNombre (String nom){
		this.nombre = nom;
	}

	public void setPoder (int pow){
		this.poder = pow;
	}

	public void setVida (int vid){
		this.vidas = vid;
	}

	public String getNombre (){
		return this.nombre;
	}

	public int getPoder (){
		return this.poder;
	}

	public int getVida (){
		return this.vidas;
	}

    public void sethabilidad1 (int habilidadE1){
		this.habilidadE1 = habilidadE1;
	}

    public int gethabilidad1(){
        return habilidadE1;
    }

    public void sethabilidad2 (int habilidadE2){
		this.habilidadE2 = habilidadE2;
	}

    public int gethabilidad2(){
        return habilidadE2;
    }

    public void setItem (int item){
		this.item = item;
	}

    public int getItem(){
        return item;
    }


    /**
    * Metodo para reducir las vidas en un ataque
    */
    public int ataque(){
        int dano = vidas-poder;
        return dano;
    }

    /**
    * Metodo para dar las vidas que quedan luego del ataque
    */
    public void dano(int vidas){
        this.vidas = vidas;
    }
}
 