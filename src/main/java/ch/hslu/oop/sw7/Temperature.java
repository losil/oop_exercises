/**
 * 
 */
package ch.hslu.oop.sw7;

import java.util.Objects;

/**
 * @author silvan
 *
 */
public class Temperature implements Comparable<Temperature> {
	private double temperature;
	
	public Temperature() {
		temperature = 20.0;
	}
	
	public Temperature(double t) {
		temperature = t;
	}
	
	public double getTemperatureCelsius() {
		return temperature;
	}
	
	public void setTemperature(double t) {
		temperature = t;
	}
	
	public double getTemperatureKelvin() {
		return temperature + 273.15;
	}
	
	public double getTemperatureFahrenheit() {
		return temperature * 1.8 + 32;
	}
	
	public void setDeltaCelsius(double t) {
		temperature = temperature + t;
	}
	
	public void setDeltaKelvin(double t) {
		temperature = temperature + t;
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
