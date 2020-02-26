
public class Demo {

	public static void main(String[] args) {
		Duck millardDuck = new MillardDuck();
		Turkey wildTurkey = new WildTurkey();
		
		millardDuck.quack();
		millardDuck.fly();
		
		System.out.println();
		
		wildTurkey.globble();
		wildTurkey.fly();
		
		System.out.println("\n********************************************************");
		System.out.println("Turkey Adapted to Duck:\n");
		Duck wildTurkeyAdaptedToDuck = new DuckAdapter(wildTurkey);
		wildTurkeyAdaptedToDuck.quack();
		wildTurkeyAdaptedToDuck.fly();
		
		System.out.println("\n********************************************************");
		System.out.println("Duck Adapted to Turkey:\n");
		Turkey millardDuckAdaptedToTurkey = new TurkeyAdapter(millardDuck);
		millardDuckAdaptedToTurkey.globble();
		millardDuckAdaptedToTurkey.fly();
				

	}

}
