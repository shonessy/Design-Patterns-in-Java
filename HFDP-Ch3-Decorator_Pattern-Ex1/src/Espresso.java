
public class Espresso extends Beverage {
	private double price;
	
	public Espresso() {
		this.description = "Esspresso";
		this.price = 1.99;
	}
	
	@Override
	public double cost() {
		return this.price;
	}

}
