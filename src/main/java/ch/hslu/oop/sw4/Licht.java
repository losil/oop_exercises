package ch.hslu.oop.sw4;

/**
 * Class Licht creates a Licht with Interface Switchable.
 *
 * @author (Silvan Loser)
 * @version (v1.0)
 */
public class Licht implements Switchable
{
    private boolean state;
    private int lumen;

    /**
     * Constructor for objects of class Motor
     */
    public Licht()
    {
        // initialise instance variables
        state = false;
        lumen = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn() {
        this.state = true;
        this.lumen = 1500;
     
    }
    
    public void switchOff() {
        this.state = false;
        this.lumen  = 0;
    
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
