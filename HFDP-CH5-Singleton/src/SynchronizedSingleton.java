
public class SynchronizedSingleton {
	private static SynchronizedSingleton instance;
	private long timeCreated;
	
	private SynchronizedSingleton(){
		this.timeCreated = System.currentTimeMillis();
	}
	
	public static synchronized SynchronizedSingleton getInstance(){
		if(instance ==null)
			instance = new SynchronizedSingleton();
		return instance;
	}
	
	// other concrete methods
	public void printTimeCreated(){
		System.out.println("Time Created: " + this.timeCreated);
		
	}
	
}
