
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String pizzaType) {		
		if(pizzaType == "sir")
			return new NYCheesePizza();
		else if(pizzaType == "vegeterijana")
			return new NYVeggiePizza();
		
		return null;			
	}

}
