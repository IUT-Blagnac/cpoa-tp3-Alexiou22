package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFabriqueDePizzaBrest {

	
	@Test
	void FabriqueDePizzaBrestFromage() {
		Pizzeria fabriquePizzaBrest = FabriqueDePizzeria.getInstance().creer("Brest");
		Pizza pizza = fabriquePizzaBrest.commanderPizza("fromage");
		assertEquals(pizza.nom, "Pizza sauce style brest et fromage");
	}
	
	@Test
	void FabriqueDePizzaBrestGrec() {
		Pizzeria fabriquePizzaBrest = FabriqueDePizzeria.getInstance().creer("Brest");
		Pizza pizza = fabriquePizzaBrest.commanderPizza("grec");
		assertEquals(pizza.nom, "Pizza sauce style brest et grecque");
	}
	
	@Test
	void FabriqueDePizzaBrestPoivrons() {
		Pizzeria fabriquePizzaBrest = FabriqueDePizzeria.getInstance().creer("Brest");
		Pizza pizza = fabriquePizzaBrest.commanderPizza("poivron");
		assertEquals(pizza.nom, "Pizza sauce style brest et poivrons");
	}
	
	void FabriqueDePizzaBrestCouper() {
		Pizzeria fabriquePizzaBrest = FabriqueDePizzeria.getInstance().creer("Brest");
		Pizza pizza = fabriquePizzaBrest.commanderPizza("fromage");
		String couper = pizza.coupertest();
		assertEquals(couper, "Decoupage en parts triangulaires");
	}

}
