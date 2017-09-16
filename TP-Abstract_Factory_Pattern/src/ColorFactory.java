
public class ColorFactory extends Factory {

	@Override
	protected Shape getShape(String shapeType) {
		return null;
	}

	@Override
	protected Color getColor(String colorType) {
		if(colorType == "red")
			return new Red();
		else if(colorType == "blue")
			return new Blue();
		return null;
	}

}
