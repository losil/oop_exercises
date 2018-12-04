/**
 * 
 */
package ch.hslu.oop.sw9;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Class which stores temperature and returns temperature in celsius, fahrenheit and kelvin.
 * @author silvan
 *
 */
public final class Temperature implements Comparable<Temperature> {
	private final double temperature;
	private static final double KELVIN_OFFSET = 273.15;
	private static final Logger LOG  = LogManager.getLogger(Temperature.class);
	
	private Temperature(double t) {
		this.temperature = t;
	}
	
	public static Temperature createFromCelsius(final double temp) {
		return new Temperature(temp);
	}
	
	public static Temperature createFromKelvin(final double temp) {
		if (temp < 0) {
			throw new IllegalArgumentException("No temperatures below 0 Kelvin possible!");
			}
		return new Temperature(temp - KELVIN_OFFSET);	
	}

	
	
	public double getTemperatureCelsius() {
		return temperature;
	}
	
	
	/**
	 * Method which returns temperature in Kelvin.
	 * @return temperature in kelvin
	 */
	public double getTemperatureKelvin() {
		return convertCelsiusToKelvin(this.temperature);
	}
	
	/**
	 * Method which returns temperature in fahrenheit.
	 * @return temperature in fahrenheit
	 */
	public double getTemperatureFahrenheit() {
		return this.temperature * 1.8 + 32;
	}
	
	
	public static double convertKelvinToCelsius(double kelvin) {
		return kelvin - KELVIN_OFFSET;
		
	}
	
	public static double convertCelsiusToKelvin(double celsius) {
		return celsius + KELVIN_OFFSET;
	}
	
	@Override
	public String toString() {
		return "Temperature is: " + this.temperature + " Celsius and : " + Temperature.convertCelsiusToKelvin(this.temperature) + " Kelvin";
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this ) {
			return true;
		}
		
		if (!(obj instanceof Temperature)) {
			return false;
		}
		
		final Temperature other = (Temperature) obj;
		return (other.temperature == this.temperature);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.temperature);
	}

	/**
	 * Override of method compareTo() to compare temperatures.
	 */
	@Override
	public int compareTo(Temperature other) {
		return Double.compare(this.temperature, other.temperature);
	}
	
	
    }
