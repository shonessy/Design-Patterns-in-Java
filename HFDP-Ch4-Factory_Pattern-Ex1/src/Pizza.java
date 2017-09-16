
public abstract class Pizza {
	protected String type; 
	
	public void prepare() {
		System.out.println("Pripremam picu: " + this.type);
	}
	
	public void bake() {
		System.out.println("Pecem picu: " + this.type);
	}
	
	public void cut() {
		System.out.println("Sijecem picu: " + this.type);
	}
	
	public void box() {
		System.out.println("Pakujem picu: " + this.type);
	}
	
}
