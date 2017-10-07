
public class Demo {

	public static void main(String[] args) {
		Container namesRepository = new NamesRepository();
		Iterator iterator = namesRepository.getIterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}
