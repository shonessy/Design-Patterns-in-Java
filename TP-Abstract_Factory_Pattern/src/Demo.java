
public class Demo {

	public static void main(String[] args) {
		Factory factory;
		Shape shape;
		Color color;
		
		
		factory = FactoryProducer.getFactory("shape");
		shape = factory.getShape("rectangle");
		shape.draw();
		
		System.out.println("\n**************\n");
		
		shape = factory.getShape("circle");
		shape.draw();
		
		System.out.println("\n**************\n");
		
		factory = FactoryProducer.getFactory("color");
		color = factory.getColor("red");
		color.fill();
		
		System.out.println("\n**************\n");
		
		color = factory.getColor("blue");
		color.fill();
				

	}

}
