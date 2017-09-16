
public class Demo {

	public static void main(String[] args) {
		Shape rect = new Rectangle();
		rect.draw();
		System.out.println("**************************");
		rect = new RedBorderDecorator(rect);
		rect.draw();
		
		System.out.println();
		
		Shape circe = new Circle();
		circe.draw();
		System.out.println("**************************");
		circe = new BlueBorderDecorator(circe);
		circe = new RedBorderDecorator(circe);
		circe = new RedBorderDecorator(circe);
		circe = new RedBorderDecorator(circe);
		circe.draw();

	}

}
