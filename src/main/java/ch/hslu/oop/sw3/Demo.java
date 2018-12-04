package ch.hslu.oop.sw3;

public class Demo {

	
	public Demo() {
		//comment
	}
	
	public int max(final int a, final int b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public int min(final int a, final int b) {
		if (a < b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public int max(final int a, final int b, final int c) {
		if (a > b && a > c) {
			return a;
		}
		
		else if (b > a && b > c) {
			return b;
		}
		else {
			return c;
		}
	}
	
	public int max1(final int a, final int b, final int c) {
		if (a > b && a > c) {
			return a;
		}
		if (b > a && b > c) {
			return b;
		}
		else {
			return c;
		}
		
	}
	
	public void printLines() {
		for (int i = 0 ; i <= 10 ; i++) {
			System.out.println(i);
		}
		int i = 0;
		while ( i <= 10) {
			System.out.println(i);
			i++;
		}
		
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		
		float f = 0.9f;
		i = 0;
		while (f < 1.0f) {
			f += 0.000025f;
			i++;
		}
		System.out.println("while ran " + i  + " times..");
		
		f = 0.9f;
		for ( i = 0; i <= 4006 ; i++) {
			f += 0.000025f;
			i++;
		}
		System.out.println(f);
		
		for ( i = 0 ; i <= 6; i++ ) {
			if ( i == 0 || i == 6 ) {
				System.out.println( "##########" );
			}
			else {
				System.out.println("#" + "        " + "#");
			}
			
		}
		
	}
	
	public void printBox(final int height, final int width) {
		
	}
	
	
	
}
