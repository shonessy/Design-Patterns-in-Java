
public class Demo {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("sir");
		
		System.out.println("\n**************\n");
		
		pizzaStore.orderPizza("vegeterijana");
		
		System.out.println("\n**************\n");
		
		pizzaStore = new LAPizzaStore();
		pizzaStore.orderPizza("vegeterijana");
		
		System.out.println("\n**************\n");
		
		pizzaStore.orderPizza("sir");

	}

}
