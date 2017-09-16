
public class Whip extends CondimentDecorator{
	private double price;
	
	public Whip(Beverage beverage) {
		super(beverage);
		this.price = 0.10;
	}
	
	public String getDescription() {
		return this.decoratedBeverage.getDescription() + ", Whip";		
	}

	public double cost() {
		return this.decoratedBeverage.cost() + this.price;
	}
}
