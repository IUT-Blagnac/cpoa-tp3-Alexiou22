package tp3;

public class PizzaTestDrive {
    public static void main(String[] args) {
        Pizzeria boutiqueBrest = FabriqueDePizzeria.getInstance().creer("Brest");
        Pizzeria boutiqueStrasbourg = FabriqueDePizzeria.getInstance().creer("Strasbourg");

        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("JMB a commandé une " + pizza.getNom() + "\n");

        pizza = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println("JMI a commandé une " + pizza.getNom() + "\n");
    }
}
