package tp3;

public class PizzaFromageStyleStrasbourg extends Pizza{

		public PizzaFromageStyleStrasbourg() {
			this.nom = "Pizza sauce style Strasbourg et fromage";
			this.garnitures.add("Mozzarella en lamelles");
		
		}
		@Override
		protected void couper() {
			super.couper();
			System.out.println("Decoupage en parts carrees");
		}
		@Override
		protected String coupertest() {
			return "Decoupage en parts carrees";
		}

}
