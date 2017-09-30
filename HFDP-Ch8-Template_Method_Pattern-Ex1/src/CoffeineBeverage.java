
public abstract class CoffeineBeverage {
	
	public final void prepareRecepie() {
		this.boilWather();
		this.brew();
		this.pourInCup();
		this.addCondiments();
		this.putIce();
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	public void boilWather(){
		System.out.println("I am boilng the wather");
	}
	
	public void pourInCup(){
		System.out.println("I am pouring beverage in a cup");
	}
	
	// hook method
	public void putIce(){}
}
