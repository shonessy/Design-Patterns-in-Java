
public class NamesRepository implements Container {
	private String[] names = {"Ana Bekuta", "Miar Skoric", "Ceca", "Iron Maden"};
	
	@Override
	public Iterator getIterator() {
		return new NamesIterator(names);
	}
}
