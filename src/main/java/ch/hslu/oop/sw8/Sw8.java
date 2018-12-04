/**
 * 
 */
package ch.hslu.oop.sw8;

/**
 * @author silvan
 *
 */
public class Sw8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Temperature.convertCelsiusToKelvin(36.9));
		System.out.println(Temperature.convertKelvinToCelsius(193));
		Temperature temp1 = new Temperature(3.6);
		System.out.println(temp1.toString());
		
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		tempverlauf1.add(temp1);
		System.out.println(tempverlauf1.hashCode());
		
		
		Quecksilber queck1 = new Quecksilber(74.6);
		System.out.println("Quecksilber ist bei : "  + queck1.getTemp() +  " Grad Celsius  " + queck1.getAggregateState());
		

	}

}
