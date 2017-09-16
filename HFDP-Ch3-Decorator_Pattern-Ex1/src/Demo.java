
public class Demo {

	public static void main(String[] args) {
		Beverage esspresso1 = new Espresso();
		System.out.println(esspresso1.getDescription());
		System.out.println("Price: " + esspresso1.cost());
		System.out.println();
		
		Beverage esspresso2 = new Espresso();
		esspresso2 = new Mocha(esspresso2);
		esspresso2 = new Whip(esspresso2);
		esspresso2 = new Whip(esspresso2);
		System.out.println(esspresso2.getDescription());
		System.out.println("Price: " + esspresso2.cost());
		System.out.println();
		
		Beverage house1 = new HouseBlend();
		System.out.println(house1.getDescription());
		System.out.println("Price: " + house1.cost());
		System.out.println();
		
		Beverage house2 = new HouseBlend();
		house2 = new Whip(house2);
		house2 = new Mocha(house2);
		house2 = new Whip(house2);
		System.out.println(house2.getDescription());
		System.out.println("Price: " + house2.cost());
		System.out.println();

	}

}
