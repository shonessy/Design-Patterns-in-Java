
public class DuckAdapter implements Duck {
	private Turkey turkey;
	
	public DuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		this.turkey.globble();
	}

	@Override
	public void fly() {
		this.turkey.fly();
	}

}
