
public class MenuItem {
	private String name;
	private String description;
	private boolean vegeterian;
	private double price;
	
	public MenuItem(String name, String desription, boolean vegeterian, double price) {
		this.name= name;
		this.description = desription;
		this.vegeterian = vegeterian;
		this.price = price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public boolean isVegeterian(){
		return this.vegeterian;
	}
	
	public double getPrice(){
		return this.price;
	}
}
