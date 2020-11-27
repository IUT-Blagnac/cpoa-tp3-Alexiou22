package tp3;

public class PizzaPoivronStyleBrest extends Pizza {
	
	public PizzaPoivronStyleBrest() {
		this.nom = "Pizza sauce style brest et poivrons";
		this.garnitures.add("Parmigiano reggiano rapé");
	}
	
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts triangulaires");
	}


}
