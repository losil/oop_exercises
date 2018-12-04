/**
 * 
 */
package ch.hslu.oop.sw11;

import java.util.EventObject;

/**
 * @author silvan
 *
 */
public class TemperatureEvent extends EventObject {

	private static final long serialVersionUID = 18394293840L;
	private String propertyName;
	private Object oldValue;
	private Object newValue;
	

	public TemperatureEvent(Object source, String propertyName, Object oldValue, Object newValue) {
		super(source);
		this.propertyName = propertyName;
		this.oldValue = oldValue;
		this.newValue = newValue;
		
	}
	
	public Object getNewValue() {
		return this.newValue;
	}
	
	public Object getOldValue() {
		return this.oldValue;
	}

	public String getPropertyName() {
		return this.propertyName;
	}
	
	/**
	 * Override of toString method
	 */
	public String toString() {
		return "ID: " + TemperatureEvent.serialVersionUID + ", Name: " + this.propertyName + ". oldValue: " + this.oldValue + ", newValue: " + this.newValue;
	}
	

}
