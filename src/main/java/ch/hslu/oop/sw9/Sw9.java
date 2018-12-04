/**
 * 
 */
package ch.hslu.oop.sw9;

/**
 * Main method for package ch.hslu.oop.sw9.
 * @author silvan
 *
 */

import java.util.Scanner;

import org.apache.logging.log4j.*;


public class Sw9 {

	private static Scanner scanner;
	private static final Logger LOG = (Logger) LogManager.getLogger(Sw9.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input;
		scanner = new Scanner(System.in); 
		do {
			LOG.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
			input = scanner.next();
			try {
			    float value = Float.valueOf(input);
			} catch (Exception e ) {
				continue;
		
				
			}
			
		} while (!input.equals("exit"));
			LOG.info("Programm beendet.");
		
		//Temperature tempC = Temperature.createFromCelsius(20);
		//Temperature tempK = Temperature.createFromKelvin(-290);

	}

}
