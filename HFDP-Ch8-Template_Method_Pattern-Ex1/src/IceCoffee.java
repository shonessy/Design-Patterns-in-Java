
public class IceCoffee extends CoffeineBeverage {

	@Override
	public void brew() {
		System.out.println("I am putting coffee in boiled wather");

	}

	@Override
	public void addCondiments() {
		System.out.println("I am putting sugar and milk in the coffee");

	}
	
	@Override
	public void putIce(){
		System.out.println("I am putting ice qubes in the coffee");
	}
	

}
