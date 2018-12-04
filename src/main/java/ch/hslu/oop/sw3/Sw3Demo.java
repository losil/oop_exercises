package ch.hslu.oop.sw3;

public class Sw3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo01 = new Demo();
		System.out.println(demo01.max(17, 14));
		System.out.println(demo01.max(10, 30, 5));
		System.out.println(demo01.max1(10, 30, 5));
		
		Point point01 = new Point(2,5);
		Point point02 = new Point(-3,10);
		Point point03 = new Point(-5,1-10);
		Point point04 = new Point(3,-90);
		
		System.out.println(point01.getQuadrant());
		System.out.println(point02.getQuadrant());
		System.out.println(point03.getQuadrant());
		System.out.println(point04.getQuadrant());
		
		demo01.printLines();
		
		
	}

}
