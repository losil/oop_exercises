package ch.hslu.oop.sw6;

public class Sw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point1 = new Point(1,2);
		System.out.println(point1.getPoint());
		point1.moveRelative(3, 10);
		System.out.println(point1.getPoint());
		
		Point point2 = new Point(1,2);
		System.out.println(point2.getPoint());
		point2.moveRelative(point1);
		System.out.println(point2.getPoint());
		
		Point point3 = new Point(point1);
		System.out.println(point3.getPoint());
		
		Stickstoff stickstoff1 = new Stickstoff(32);
		System.out.println(stickstoff1.toString());
		
		Quecksilber quecksilber1 = new Quecksilber(32);
		System.out.println(quecksilber1.toString());
		
		Shape shape1 = new Circle(2,3,6);
		Shape shape2 = new Rectangle(3,5,6,7);
		System.out.println(shape1.getPerimeter());
		System.out.println(shape2.getArea());
		shape1.move(4, 5);
		shape2.move(1, 9);
		
		System.out.println(((Circle)shape1).getDiameter());
		
		Circle shape3 = (Circle) shape1;
		System.out.println( shape3.getDiameter());
		
		Calculator calc1 = new Calculator();
		System.out.println(calc1.addition(4, 9));
		
		CalculatorService calc2 = new Calculator();
		int res = calc2.addition(3, 5);
		System.out.println(res);
		
		

	}

}
