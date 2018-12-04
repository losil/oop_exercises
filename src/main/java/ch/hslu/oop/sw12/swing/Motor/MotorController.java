/**
 * 
 */
package ch.hslu.oop.sw12.swing.Motor;

/**
 * @author silvan
 *
 */
public class MotorController implements Switchable {

	private int count = 1;
	/*
	 * (non-Javadoc)
	 * 
	 * @see ch.hslu.oop.sw10.Switchable#switchOn()
	 */
	@Override
	public void switchOn(MotorModel motor) {
		if (isSwitchedOff(motor)) {
			motor.setState(MotorState.ON);
			motor.setRpms(1000);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ch.hslu.oop.sw10.Switchable#switchOff()
	 */
	@Override
	public void switchOff(MotorModel motor) {
		if (isSwitchedOn(motor)) {
			motor.setState(MotorState.OFF);
			motor.setRpms(0);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ch.hslu.oop.sw10.Switchable#isSwitchedOn()
	 */
	@Override
	public boolean isSwitchedOn(MotorModel motor) {
		if (motor.getState() == MotorState.ON) {
			return true;
		}
		
		
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ch.hslu.oop.sw10.Switchable#isSwitchedOff()
	 */
	@Override
	public boolean isSwitchedOff(MotorModel motor) {
		if (motor.getState() == MotorState.OFF) {
			return true;
		}
		return false;
	}
	
	public int getRpms(MotorModel motor) {
		return motor.getRpms();
	}
	
	public void setRpms(MotorModel motor, int rpms) {
		motor.setRpms(rpms);
	}

	public void changeRpms(MotorModel motor, int rpms) { motor.changeRpms(rpms);}
	
	
	public void count() {
		this.count += 1;
	}
	
	public int getCount() {
		return this.count;
	}


}
