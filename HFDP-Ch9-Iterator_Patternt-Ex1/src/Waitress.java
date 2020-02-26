import java.awt.Menu;

public class Waitress {
	private PancakeMenu pancakeMenu;
	private DinerMenu dinerMenu;
	
	public Waitress(PancakeMenu pancakeMenu, DinerMenu dinerMenu) {
		this.pancakeMenu = pancakeMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		System.out.print("MENU: \n-----------\n");
		System.out.println("BRAKFAST: ");
		this.printMenu(this.pancakeMenu.createIterator());
		
		System.out.println("\nDINER: ");
		this.printMenu(this.dinerMenu.createIterator());
	}
	
	private void printMenu(Iterator iterator){
			while(iterator.hasNext()){
				MenuItem item = (MenuItem) iterator.next();
				System.out.print(item.getName() + " -- ");
				System.out.print(item.getDescription() + " -- ");
				System.out.print(item.isVegeterian() + " -- ");
				System.out.print(item.getPrice() + "\n");
			}
		}
}
