/**
 * 
 */
package tp3;

import java.util.ArrayList;

/**
 * @author Alexia
 *
 */
public abstract class Pizza {

	private String nom;
	private String pate;
	private String sauce;
	private ArrayList garnitures;

	/**
	 * 
	 */
	protected Pizza() {
		this.nom = "";
		this.pate = "";
		this.sauce = "";
		this.garnitures = new ArrayList();
		
	}


	protected void preparer() {
		System.out.println("Préparation de " + this.nom );
		System.out.println("Étalage de la pâte...");
		System.out.println("Ajout de la sauce... ");
		System.out.println("Ajout des garnitures:");
		//for ()
	}

	protected void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}

	protected void couper() {
		System.out.println("Découpage en parts" );
	}

	protected void emballer() {
		System.out.println("Emballage dans une boîte officielle");

	}
	protected String getNom() {
		
		return this.nom;

	}
}
