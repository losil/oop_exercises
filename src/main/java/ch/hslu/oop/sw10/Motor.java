
package ch.hslu.oop.sw10;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class Motor describes a motor object.
 * @author silvan
 *
 */
public class Motor implements Switchable, Comparable<Motor>{
	private MotorState state;
	private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
    /**
     * Constructor for objects of class Motor.
     */
    public Motor()
    {
        this.state = MotorState.OFF;
    }

    /**
     * Switch Motor on.
     */
    @Override
    public void switchOn() {
        this.state = MotorState.ON;
        final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorState.OFF, MotorState.ON);
        this.firePropertyChangeEvent(pcEvent);
     
    }
    /**
     * Switch Motor off.
     */
    public void switchOff() {
        this.state = MotorState.OFF;
        final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorState.ON, MotorState.OFF);
        this.firePropertyChangeEvent(pcEvent);
    
    }
    
    /**
     * Check if motor is running.
     * @return true if motor is running
     */
    public boolean isSwitchedOn() {
        if (state == MotorState.ON ) {
            return true;
        }
        
        else { 
            return false;
        }
    }
    
    /**
     * Check if motor is switched off.
     * @return true if motor is not running
     */
    public boolean isSwitchedOff() {
        if (state == MotorState.OFF) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Override of the toString method
     * @return String which describes state of object
     */
    @Override
    public String toString() {
    		if ( this.isSwitchedOn()) {
    			return "Motor is running.";
    		}
    		
    		else {
    			return "Motor is not running.";
    		}
    }
    
    /**
     * equals method for a Motor-object
     * @return true if objects equals
     */
    @Override
	public boolean equals(final Object obj) {
		if (obj == this ) {
			return true;
		}
		
		if (!(obj instanceof Motor)) {
			return false;
		}
		
		final Motor other = (Motor) obj;
		return (other.state == this.state);
    }
    
    /**
     * Override of hashCode
     * @returns hashCode of object
     */
    @Override
    public int hashCode() {
    		return Objects.hashCode(this.state);
    }
    
    /**
     * Override of method compareTO
     * @return value of compare result
     */
    @Override
    public int compareTo(Motor other) {
    	if (this.state == other.state) {
    		return 0;
    	}
    	
    	if (this.state == MotorState.OFF && other.state == MotorState.ON) {
    		return -1;
    	}
    	
    	else {
    		return 1;
    	}
    	
    }
   
	
	/**
	 * addPropertyChangeListener adds Property to changeListeners Array.
	 */
	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		this.changeListeners.add(listener);
	}
	
	/**
	 * removePropertyChangeListener removes Property from changeListeners Array
	 * @param listener
	 */
	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		this.changeListeners.remove(listener);
	}

    /**
     * firePropertyEvent method fires event when property changed
     * 
     */
    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
    		for(final PropertyChangeListener listener : this.changeListeners) {
    			listener.propertyChange(pcEvent);
    		}
}
}
