
public class Demo {

	public static void main(String[] args) {
		PancakeMenu pancakeMenu = new PancakeMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeMenu, dinerMenu);
		waitress.printMenu();

	}

}
