package ch.hslu.oop.sw14;

import java.util.Objects;


/**
 * @author silvan
 *
 */
public final class Temperature implements Comparable<Temperature> {
    private double temperature;
    private static final double KELVIN_OFFSET = 273.15;

    public Temperature() {
        this.temperature = 20.0;
    }

    public Temperature(double t) {
        this.temperature = t;
    }

    public double getTemperatureCelsius() {
        return temperature;
    }

    public void setTemperature(double t) {
        this.temperature = t;
    }

    public double getTemperatureKelvin() {
        return Temperature.convertCelsiusToKelvin(this.temperature);
    }

    public double getTemperatureFahrenheit() {
        return this.temperature * 1.8 + 32;
    }

    public void setDeltaCelsius(double t) {
        this.temperature = temperature + t;
    }

    public void setDeltaKelvin(double t) {
        this.temperature = temperature + t;
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

    public static double convertKelvinToCelsius(double kelvin) {
        return kelvin - KELVIN_OFFSET;

    }

    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + KELVIN_OFFSET;
    }


}
