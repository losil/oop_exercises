/**
 * 
 */
package ch.hslu.oop.sw10;

import java.beans.PropertyChangeEvent;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class which provides an Auto object with basic carpart attributes stored.
 * @author silvan
 *
 */
public class Auto implements Switchable, PropertyChangeListener {
	private static final Logger LOG  = LogManager.getLogger(Auto.class);
	private Motor motor1;
    private Licht licht1;
	/**
     * Constructor for objects of class Auto.
     */
    public Auto() {
        motor1 = new Motor();
        licht1 = new Licht();
        this.motor1.addPropertyChangeListener(this);
        this.licht1.addPropertyChangeListener(this);
    }
    
    /**
     * Switch on Motor and light.
     */
    @Override
    public void switchOn()
    {	
    		if (isSwitchedOff()) {
    			motor1.switchOn();
    			licht1.switchOn();
         }
    }
    /**
     * Switch motor and light off.
     */
    @Override
    public void switchOff()
    {
        motor1.switchOff();
        licht1.switchOff();
    }
    
    /**
     * Check if state is on.
     *  @return true if Auto is running
     */
    @Override
    public boolean isSwitchedOn()
    {
        if ( motor1.isSwitchedOn() == true && licht1.isSwitchedOn() == true )
        {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Check if state is off.
     *  @return true if Auto is not running
     */
    @Override
    public boolean isSwitchedOff() 
    {
        if ( motor1.isSwitchedOn() == false && licht1.isSwitchedOn() == false )
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Override of method toString
     * @return running state of auto
     */
    public String toString() {
    		if (this.isSwitchedOn()) {
    			return "Auto is running.";
    		}
    		
    		else {
    			return "Auto is not running.";
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
		
		if (!(obj instanceof Auto)) {
			return false;
		}
		
		final Auto other = (Auto) obj;
		return (other.licht1 == this.licht1 && other.motor1 == this.motor1);
    }
    
    /**
     * Override of hashCode
     * @returns hashCode of object
     */
    @Override
    public int hashCode() {
    		return Boolean.hashCode(this.isSwitchedOn());
    }
    
    /**
     * Override of method compareTO
     * @return value of compare result
     */
//    @Override
//    public int compareTo(Auto other) {
//    		return Comparable<Auto>.compare(this, other);
    
    /**
     * propertyChange method
     */
    @Override
    public void propertyChange(final PropertyChangeEvent event) {
    	    if (event.getSource() == this.motor1 ) {
    	    		LOG.info("MotorState changed" + event.toString());
    	    }
    	    
    	    if (event.getSource() == this.licht1 ) {
    	    	    LOG.info("LichtState changed" + event.toString());	
    	    }
   
    

    }

	/* (non-Javadoc)
	 * @see ch.hslu.oop.sw10.PropertyChangeListener#propertyChange(ch.hslu.oop.sw10.TemperatureEvent)
	 */
	@Override
	public void propertyChange(TemperatureEvent pcEvent) {
		// TODO Auto-generated method stub
		
	}
    	
}
 