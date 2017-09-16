
public class HouseBlend extends Beverage {
	private double price;
	
	public HouseBlend() {
		this.description= "House Blend";
		this.price = 0.89;
	}
	
	@Override
	public double cost() {
		return this.price;
	}

}
