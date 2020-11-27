package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFabriqueDePizzaStrasbourg {

	
	@Test
	void FabriqueDePizzaStrasbourgFromage() {
		Pizzeria fabriquePizzaStrasbourg = FabriqueDePizzeria.getInstance().creer("Strasbourg");
		Pizza pizza = fabriquePizzaStrasbourg.commanderPizza("fromage");
		assertEquals(pizza.nom, "Pizza sauce style Strasbourg et fromage");
	}
	
	@Test
	void FabriqueDePizzaStrasbourgGrec() {
		Pizzeria fabriquePizzaStrasbourg = FabriqueDePizzeria.getInstance().creer("Strasbourg");
		Pizza pizza = fabriquePizzaStrasbourg.commanderPizza("grec");
		assertEquals(pizza.nom, "Pizza sauce style Strasbourg et grecque");
	}
	
	@Test
	void FabriqueDePizzaStrasbourgPoivrons() {
		Pizzeria fabriquePizzaStrasbourg = FabriqueDePizzeria.getInstance().creer("Strasbourg");
		Pizza pizza = fabriquePizzaStrasbourg.commanderPizza("poivron");
		assertEquals(pizza.nom, "Pizza sauce style Strasbourg et poivrons");
	}
	
	void FabriqueDePizzaStrasbourgCouper() {
		Pizzeria fabriquePizzaStrasbourg = FabriqueDePizzeria.getInstance().creer("Strasbourg");
		Pizza pizza = fabriquePizzaStrasbourg.commanderPizza("fromage");
		String couper = pizza.coupertest();
		assertEquals(couper, "Decoupage en parts carrees");
	}


}
