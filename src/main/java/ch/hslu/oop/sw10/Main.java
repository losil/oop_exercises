
package ch.hslu.oop.sw10;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Main class of SW10 exercises
 * @author silvan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Logger LOG  = LogManager.getLogger(Main.class);
		Auto auto1 = new Auto();
		auto1.switchOn();
		LOG.info(auto1.toString());
		auto1.switchOff();
		LOG.info(auto1.toString());
		
		
		TemperatureVerlauf tempverlauf = new TemperatureVerlauf();
		String input;
		Scanner scanner = new Scanner(System.in); 
		do {
			LOG.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
			input = scanner.next();
			try {
			    double value = Float.valueOf(input);
			    tempverlauf.add(Temperature.createFromCelsius(value));
			    
			} catch (NumberFormatException e ) {
				LOG.error("No double value inserted, try again!");
				continue;
		
				
			}
			
		} while (!input.equals("exit"));
		
		scanner.close();	
		LOG.info("Programm beendet.");
		LOG.info(tempverlauf.getCount() + " tempearture objects inserted.");
		LOG.info(tempverlauf.getAverageTemp() + " is the average temperature");
		LOG.info(tempverlauf.getMaxTemp() + " is the max temperature entered.");
		LOG.info(tempverlauf.getMinTemp() + " is the min temperature entered.");
		LOG.info(tempverlauf.toString());
		
		
		Sensor sensor = new Sensor();
		sensor.add(Temperature.createFromCelsius(3.4));
		sensor.add(Temperature.createFromCelsius(32));
		sensor.add(Temperature.createFromCelsius(40));
		LOG.info(sensor.toString());
		
		

	}

}
