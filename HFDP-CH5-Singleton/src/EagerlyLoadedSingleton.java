
public class EagerlyLoadedSingleton {
	public static EagerlyLoadedSingleton instance = new EagerlyLoadedSingleton();
	private long timeCreated;
	
	private EagerlyLoadedSingleton(){
		this.timeCreated = System.currentTimeMillis();
	}
	
	public static EagerlyLoadedSingleton getInstance(){
		return instance;
	}
	
	// other concrete methods
	public void printTimeCreated(){
		System.out.println("Time Created: " + this.timeCreated);
		
	}
}
