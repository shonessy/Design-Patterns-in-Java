
public class NamesIterator implements Iterator {
	private String names[];
	private int index;
	
	public NamesIterator(String names[]) {
		this.names = names;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		return !(this.index >= this.names.length);			
	}

	@Override
	public Object next() {
		return this.names[index++];
	}

}
