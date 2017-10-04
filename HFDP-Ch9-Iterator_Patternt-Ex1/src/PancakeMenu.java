import java.util.ArrayList;

public class PancakeMenu {
	private ArrayList<MenuItem> menuItems;
	
	public PancakeMenu() {
		this.menuItems = new ArrayList<>();
		this.addMenuItem("Palacinka sa kremom", "Euro Krem", true, 2.99);
		this.addMenuItem("Palacinka sa nutelom", "Nutela", true, 3.99);
		this.addMenuItem("Palacinka sa sunkom i sirom", "Sir, Sunka", false, 4.20);
		this.addMenuItem("Palacinka sa piletinom i pecurkama", "Sir, Piletina, Pecurke", false, 4.80);
	}
	
	private void addMenuItem(String name, String desription, boolean vegeterian, double price){
		MenuItem item = new MenuItem(name, desription, vegeterian, price);
		this.menuItems.add(item);
	}
	
	public ArrayList<MenuItem> getMenuItems(){
		return this.menuItems;
	}
	
	public Iterator createIterator(){
		return new PancakeMenuIterator(menuItems);
	}
}
