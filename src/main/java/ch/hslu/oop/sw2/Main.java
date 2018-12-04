package ch.hslu.oop.sw2;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temperature temp = new Temperature();
		System.out.println(temp.getTemperatureCelsius() + "C");
		System.out.println(temp.getTemperatureFahrenheit() + "F");
		System.out.println(temp.getTemperatureKelvin() + "K");
		
		temp.setTemperature(15.76);
		System.out.println(temp.getTemperatureCelsius() + "C");
		System.out.println(temp.getTemperatureFahrenheit() + "F");
		System.out.println(temp.getTemperatureKelvin() + "K");
		
		temp.setDeltaCelsius(-5.4);
		System.out.println(temp.getTemperatureCelsius() + "C");
		System.out.println(temp.getTemperatureFahrenheit() + "F");
		System.out.println(temp.getTemperatureKelvin() + "K");
		
		System.out.println(temp.getAggregatsZustand("N"));
		System.out.println(temp.getAggregatsZustand("Hg"));
		System.out.println(temp.getAggregatsZustand("Pb"));
		

	}

}
