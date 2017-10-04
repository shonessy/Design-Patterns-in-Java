import java.awt.Menu;
import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
	
	private ArrayList<MenuItem> menuItems;
	private int position;
	
	public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
		this.position = 0;
	}
	
	@Override
	public boolean hasNext() {
		return this.position < this.menuItems.size();
	}

	@Override
	public Object next() {
		//position++;
		return this.menuItems.get(position++);
		
	}

}
