
public class Demo {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
		
		pizzaStore.orderPizza("vegeterijana");
		
		System.out.println("\n**************\n");
		
		pizzaStore.orderPizza("sir");

	}

}
