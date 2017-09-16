
public class ShapeFactory extends Factory {

	@Override
	protected Shape getShape(String shapeType) {
		if(shapeType == "rectangle")
			return new Rectangle();
		else if(shapeType == "circle")
			return new Circle();
		return null;
	}

	@Override
	protected Color getColor(String colorType) {		
		return null;
	}

}
