import java.util.Iterator;

public interface Menu {
	public Iterator createIterator();
	public void addMenuItem(String name, String desription, boolean vegeterian, double price);
}
