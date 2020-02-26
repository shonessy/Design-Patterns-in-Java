
public class TurkeyAdapter implements Turkey {
	private Duck duck;
	
	public TurkeyAdapter(Duck duck) {
		this.duck= duck;
	}
	
	@Override
	public void globble() {
		this.duck.quack();

	}

	@Override
	public void fly() {
		this.duck.fly();

	}

}
