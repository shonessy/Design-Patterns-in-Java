
public class PizzaStore {
	private PizzaFactory factory;
	
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String pizzaType) {
		//Pizza pizza = PizzaFactory.createPizza(pizzaType);
		Pizza pizza = factory.createPizza(pizzaType);
			
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
