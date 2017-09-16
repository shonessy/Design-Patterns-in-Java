
public class LAPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String pizzaType) {
		if(pizzaType == "sir")
			return new LACheesePizza();
		else if(pizzaType == "vegeterijana")
			return new LAVeggiePizza();
		
		return null;
	}

}
