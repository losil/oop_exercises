/**
 * 
 */
package ch.hslu.oop.sw12.swing.Motor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author silvan
 *
 */

@SuppressWarnings("serial")
public final class MotorView extends JFrame implements ActionListener {

	private MotorController controller = new MotorController();
	private MotorModel model = new MotorModel();
	private final JLabel labelState = new JLabel("The Motor is OFF.");
	private final JButton buttonOn = new JButton("On");
	private final JButton buttonOff = new JButton("Off");
	private final JButton buttonReset = new JButton("Reset");
	private final JButton buttonIncreaseRpms = new JButton("Increase RPMs");
	private final JButton buttonDecreaseRpms = new JButton("Reduce RPMs");

	private final JPanel jpanel = new JPanel();



	

	/**
	 * Konstruktor.
	 */
	public MotorView() {
		super("Switch");

		this.buttonOn.addActionListener(this);
		this.buttonOff.addActionListener(this);
		this.buttonReset.addActionListener(this);
		this.buttonIncreaseRpms.addActionListener(this);
		this.buttonDecreaseRpms.addActionListener(this);
		this.labelState.setHorizontalAlignment(JLabel.CENTER);
		this.labelState.setOpaque(true);

		this.setLayout(new BorderLayout());
		this.add(buttonOn, BorderLayout.NORTH);
		this.add(labelState, BorderLayout.CENTER);
		this.add(buttonOff, BorderLayout.SOUTH);
		this.add(buttonIncreaseRpms, BorderLayout.WEST);
		this.add(buttonDecreaseRpms, BorderLayout.WEST);


		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);

		buttonIncreaseRpms.setEnabled(true);
		buttonDecreaseRpms.setEnabled(true);
		buttonIncreaseRpms.setText("Increase");
		buttonDecreaseRpms.setText("Decrease");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(final ActionEvent event) {
		if (event.getSource() == buttonOn) {

			if (controller.getCount() % 4 != 0) {
				controller.switchOn(model);
				labelState.setText("The Motor is ON.\n RPMs: " + controller.getRpms(model));
				labelState.setBackground(Color.GREEN);
				controller.count();
				if (controller.isSwitchedOn(model)) {
					buttonOn.setEnabled(false);
					buttonOff.setEnabled(true);
				}
			}

			else {
				this.add(buttonReset, BorderLayout.EAST);
				buttonReset.setEnabled(true);
				labelState.setText("The motor has a problem, please reset");
				labelState.setBackground(Color.RED);
				buttonOn.setEnabled(false);
				controller.count();
				
			}
		}
		if (event.getSource() == buttonOff) {
			controller.switchOff(model);
			labelState.setText("The Motor is OFF.\n RPMs: " + controller.getRpms(model));
			labelState.setBackground(Color.RED);
			if (controller.isSwitchedOff(model)) {
				buttonOff.setEnabled(false);
				buttonOn.setEnabled(true);
			}
		}

		if (event.getSource() == buttonReset) {
			labelState.setText("Motor resetet, turn on again.");
			labelState.setBackground(Color.RED);
			buttonOn.setEnabled(true);
			buttonReset.setEnabled(false);

		}
		
		if (event.getSource() == buttonIncreaseRpms) {
			controller.changeRpms(model, 1000);
			labelState.setText("The Motor is ON. \n RPMs: " + controller.getRpms(model));
		}

		if (event.getSource() == buttonDecreaseRpms) {
		    controller.changeRpms(model, -1000);
		    if (model.getRpms() == 0) {
		        labelState.setText("The Motor is OFF.\n RPMs: " + controller.getRpms(model));
		        labelState.setBackground(Color.RED);
		        buttonOff.setEnabled(false);
		        buttonOn.setEnabled(true);
            }

            else {
                labelState.setText("The Motor is ON.\n RPMs: " + controller.getRpms(model));
            }

        }
	}

	/**
	 * main-Methode.
	 * 
	 * @param args
	 *            nicht verwendet.
	 */
	public static void main(final String[] args) {
		new MotorView();
	}
}
