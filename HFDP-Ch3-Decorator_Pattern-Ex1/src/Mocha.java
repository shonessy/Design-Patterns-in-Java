
public class Mocha extends CondimentDecorator{
	private double price;
	
	public Mocha(Beverage beverage) {
		super(beverage);
		this.price = 0.20;
	}
	
	public String getDescription() {
		return this.decoratedBeverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return this.decoratedBeverage.cost()  + this.price;
	}

}
