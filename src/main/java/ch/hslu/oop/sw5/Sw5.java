package ch.hslu.oop.sw5;

public class Sw5 {

	public static void main(String[] args) {
		Circle circle1 = new Circle(2,4, 5);
		Rectangle rectangle1 = new Rectangle(5,3,10,8);
		Square square1 = new Square(3,6,8);
		
		System.out.println(circle1.getArea());
		System.out.println(rectangle1.getPerimeter());
		System.out.println(square1.getSide());
		
		

	}

}
