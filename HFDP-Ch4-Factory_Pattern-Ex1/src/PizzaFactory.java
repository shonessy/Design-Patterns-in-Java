
public class PizzaFactory {
	
	public /*static*/ Pizza createPizza(String pizzaType) {
		if(pizzaType=="sir")
			return new CheesePizza();
		else if(pizzaType=="vegeterijana") {
			return new VeggiePizza();
		}
		return null;
	}

}
