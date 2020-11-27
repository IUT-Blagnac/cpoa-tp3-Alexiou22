package tp3;

public class FabriqueDePizzaDeBrest extends FabriqueDePizza {
	static FabriqueDePizzaDeBrest instance = new FabriqueDePizzaDeBrest();
	public static FabriqueDePizzaDeBrest getInstance() {
		
		return instance;
		
	}
	
	public Pizza creerPizza(String type) {
		Pizza Pizza = null;
		if (type.equals("fromage")) {
			Pizza = new PizzaFromageStyleBrest();
		} else if (type.equals("poivron")) {
			Pizza = new PizzaPoivronStyleBrest();
		} else if (type.equals("grec")) {
			Pizza = new PizzaGrecStyleBrest();
		} 
		return Pizza;
	}



}
