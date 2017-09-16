
public class FactoryProducer {
	public static Factory getFactory(String factoryType) {
		if(factoryType == "shape")
			return new ShapeFactory();
		else if(factoryType == "color")
			return new ColorFactory();
		
		return null;
	}
}
