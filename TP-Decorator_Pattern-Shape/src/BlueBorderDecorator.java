
public class BlueBorderDecorator extends ShapeDecorator {
	
	public BlueBorderDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		this.shape.draw();
		this.setBlueBorder();
	}
	
	public void setBlueBorder() {
		System.out.println("Crtam plavu granicu");
	}
}
