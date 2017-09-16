
public abstract class CondimentDecorator extends Beverage{
	protected Beverage decoratedBeverage;
	
	public CondimentDecorator(Beverage beverage) {
		this.decoratedBeverage = beverage;
	}
		
	public abstract String getDescription();
	
}
