package tp3;

public class PizzaFromageStyleBrest extends Pizza{
	
	public PizzaFromageStyleBrest() {
		this.nom = "Pizza sauce style brest et fromage";
		this.garnitures.add("Parmigiano reggiano rape");
		
	}
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts triangulaires");
	}
	
	protected String coupertest() {
		return "Decoupage en parts triangulaires";
	}

}
