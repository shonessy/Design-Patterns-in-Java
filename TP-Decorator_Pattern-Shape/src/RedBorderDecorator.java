
public class RedBorderDecorator extends ShapeDecorator {
	
	public RedBorderDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		this.shape.draw();
		this.setRedBorder();
	}
	
	private void setRedBorder() {
		System.out.println("Postavljam crvenu liniju");
	}
}
