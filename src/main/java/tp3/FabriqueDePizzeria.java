package tp3;

public class FabriqueDePizzeria {

	static FabriqueDePizzeria instance = new FabriqueDePizzeria();
	
	public static FabriqueDePizzeria getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	
	public Pizzeria creer(String type) {
		Pizzeria Pizzeria = null;
		if (type.equals("Brest")) {
			Pizzeria = new PizzeriaDeBrest();
		} else if (type.equals("Strasbourg")) {
			Pizzeria = new PizzeriaDeStrasbourg();
		
		}
		return Pizzeria;
	}


}


