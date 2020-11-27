package tp3;

public abstract class Pizzeria {
	FabriqueDePizza FabriqueDePizza ;
	protected Pizza commanderPizza(String string) {
		
		
		Pizza instance = FabriqueDePizza.creerPizza(string);

		instance.preparer();
		instance.cuire();
		instance.couper();
		instance.emballer();

		return instance;
	}
	
}
