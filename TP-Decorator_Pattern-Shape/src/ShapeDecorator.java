
public abstract class ShapeDecorator implements Shape {
	protected Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	/*public void draw() {
		this.shape.draw();
	}*/
	public abstract void draw();

}
