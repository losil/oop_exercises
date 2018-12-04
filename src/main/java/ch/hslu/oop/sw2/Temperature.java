package ch.hslu.oop.sw2;

public class Temperature {
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
	
	public String getAggregatsZustand(String element) {
		switch (element) {
			case "Hg" :
				if (temperature < -38.8344 ) {
				return "fest";
				}
				else if (temperature >= -38.8344 && temperature <= 22.0 ) {
					return "fluessig";
				}
				else {
					return "gasfoermig";
				}
				
			case "N" :
				if (temperature < -210.1) {
					return "fest";
				}
				else if (temperature >= -210.1 && temperature < -195.79) {
					return "fluessig";
				}
				else {
					return "gasfoermig";
				}
			
			case "Pb" :
				if (temperature < 327.46 ) {
					return "fest";
				}
				
				else if (temperature >= 327.46 && temperature < 1749 ) {
					return "fluessig";
				}
				else {
					return "gasfoermig"; 
				}
			default:
				return "falsche Element-Bezeichnung";
				
		}
			
	}

    }
