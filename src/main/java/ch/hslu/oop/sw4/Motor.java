package ch.hslu.oop.sw4;
/**
 * Class Motor creates a Motor with Interface Switchable.
 *
 * @author (Silvan Loser)
 * @version (v1.0)
 */
public class Motor implements Switchable
{
    private boolean state;
    private int rpms;

    /**
     * Constructor for objects of class Motor.
     */
    public Motor()
    {
        // initialise instance variables
        state = false;
        rpms = 0;
    }

    /**
     * Switch Motor on.
     */
    @Override
    public void switchOn() {
        this.state = true;
        this.rpms = 1500;
     
    }
    /**
     * Switch Motor off.
     */
    public void switchOff() {
        this.state = false;
        this.rpms = 0;
    
    }

    public boolean isSwitchedOn() {
        if (state == true ) {
            return true;
        }
        
        else { 
            return false;
        }
    }
    
    public boolean isSwitchedOff() {
        if (state == false) {
            return true;
        }
        else {
            return false;
        }
    }
}
