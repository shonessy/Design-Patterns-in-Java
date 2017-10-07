
public class Demo {

	public static void main(String[] args) {
		Menu pancakeMenu = new PancakeMenu();
		Menu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeMenu, dinerMenu);
		waitress.printMenu();

	}

}
