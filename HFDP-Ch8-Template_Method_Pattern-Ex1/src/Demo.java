
public class Demo {

	public static void main(String[] args) {
		CoffeineBeverage tea = new Tea();
		tea.prepareRecepie();
		
		System.out.println("\n*******************************************\n");
		
		CoffeineBeverage coffee = new Coffee();
		coffee.prepareRecepie();
		
		System.out.println("\n*******************************************\n");
		
		CoffeineBeverage iceCoffee = new IceCoffee();
		iceCoffee.prepareRecepie();

	}

}
