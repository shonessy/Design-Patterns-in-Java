import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class DinerMenu {
	private MenuItem[] menuItems;
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	
	public DinerMenu() {
		this.menuItems = new MenuItem[MAX_ITEMS];
		
		this.addMenuItem("Vegetrijanska corba", "Grasak, Buranija, Sargarepa", true, 2.85);
		this.addMenuItem("Cevapi", "Telece meco", false, 3.50);
		this.addMenuItem("Spagete", "Spagete, Milaneze sos", true, 4.20);
		this.addMenuItem("Musaka", "Krompir, mleveno junece meco", false, 4.70);
	}
	
	private void addMenuItem(String name, String desription, boolean vegeterian, double price){
		MenuItem item = new MenuItem(name, desription, vegeterian, price);
		if(this.numberOfItems >= MAX_ITEMS)
			System.out.println("You excited max menu size of " + MAX_ITEMS);
		else
			this.menuItems[numberOfItems++] = item;
	}
	
	public MenuItem[] getMenuItems(){
		return this.menuItems;
	}
	
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
