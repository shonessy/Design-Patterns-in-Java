
public class DoubleCheckedLockingSingleton {
	public static DoubleCheckedLockingSingleton instance;
	private long timeCreated;
	
	private DoubleCheckedLockingSingleton(){
		this.timeCreated = System.currentTimeMillis();
	}
	
	public static DoubleCheckedLockingSingleton getInstance(){
		if(instance == null ){
			synchronized (DoubleCheckedLockingSingleton.class) {
				if(instance == null)
					instance = new DoubleCheckedLockingSingleton();
			}
		}
		return instance;
	}
	
	
	// other concrete methods
	public void printTimeCreated(){
		System.out.println("Time Created: " + this.timeCreated);
		
	}
	
}
