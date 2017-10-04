
public class DinerMenuIterator implements Iterator {
	private MenuItem[] menuItems;
	private int postition;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
		this.postition = 0;
	}
	
	@Override
	public boolean hasNext() {
		return (this.postition >= this.menuItems.length || this.menuItems[postition] == null) ? false : true;
	}

	@Override
	public Object next() {
		return this.menuItems[this.postition++];
	}

}
