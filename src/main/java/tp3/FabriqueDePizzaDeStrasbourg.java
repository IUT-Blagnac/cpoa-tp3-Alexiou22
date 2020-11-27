package tp3;

public class FabriqueDePizzaDeStrasbourg extends FabriqueDePizza{
	static FabriqueDePizzaDeStrasbourg instance = new FabriqueDePizzaDeStrasbourg();
	
	public static FabriqueDePizzaDeStrasbourg getInstance() {
		
		return instance;
	}
	
	public Pizza creerPizza(String type) {
		Pizza Pizza = null;
		if (type.equals("fromage")) {
			Pizza = new PizzaFromageStyleStrasbourg();
		} else if (type.equals("poivron")) {
			Pizza = new PizzaPoivronStyleStrasbourg();
		} else if (type.equals("grec")) {
			Pizza = new PizzaGrecStyleStrasbourg();
		} 
		return Pizza;
	}
}
