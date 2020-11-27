package tp3;

public class PizzaGrecStyleBrest extends Pizza {
	
	public PizzaGrecStyleBrest() {
		this.nom = "Pizza sauce style brest et grecque";
		this.garnitures.add("Parmigiano reggiano rapé");
	}
	
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts triangulaires");
	}

	@Override
	protected String coupertest() {

		return "Decoupage en parts triangulaires";
	}

}
