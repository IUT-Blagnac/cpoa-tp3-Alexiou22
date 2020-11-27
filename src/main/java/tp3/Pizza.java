package tp3;

import java.util.ArrayList;

public abstract class Pizza {

	protected String nom;
	protected String pate;
	protected String sauce;
	protected ArrayList<String> garnitures;

	/**
	 * 
	 */
	protected Pizza() {
		this.nom = "";
		this.pate = "";
		this.sauce = "";
		this.garnitures = new ArrayList<String>();

	}


	protected void preparer() {
		System.out.println("Preparation de " + this.nom );
		System.out.println("Etalage de la pate...");
		System.out.println("Ajout de la sauce... ");
		System.out.println("Ajout des garnitures:");
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}

	}

	protected void cuire() {
		System.out.println("Cuisson 25 minutes a 180°");
	}

	protected void couper() {
		System.out.println("Decoupage en parts" );
	}

	protected void emballer() {
		System.out.println("Emballage dans une boite officielle");

	}
	protected String getNom() {

		return this.nom;

	}
}

