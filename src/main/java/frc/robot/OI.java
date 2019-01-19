/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  public Joystick	xbox		= RobotMap.xBoxController;
	Button			ButtonY		= RobotMap.ButtonY;
	Button			ButtonA		= RobotMap.ButtonA;
	Button			ButtonStart	= RobotMap.Start;
	Button			ButtonBack	= RobotMap.Back;
	Button			RBumper		= RobotMap.RBumper;
	Button			LBumper		= RobotMap.LBumper;
	Button			ButtonB		= RobotMap.ButtonB;
	Button			ButtonX		= RobotMap.ButtonX;

	public OI()
	{

	}

	public double leftYValue(double threshold)
	{ // Gets horizontal left joystick value (how far it is pushed left or right)
		if (Math.abs(xbox.getY()) <= threshold)
		{
			return 0;
		}
		else 
		{
			return xbox.getY();
		}
	}

	public double leftXValue(double threshold)
	{ // Gets vertical left joystick value (how far it is pushed up or down)
		if (Math.abs(xbox.getX()) <= threshold)
		{
			return 0;
		}
		else 
		{
			return xbox.getX();
		}
	}
	public double rightYValue(double threshold)
	{ // Gets horizontal left joystick value (how far it is pushed left or right)
		if (Math.abs(xbox.getRawAxis(5)) <= threshold)
		{
			return 0;
		}
		else 
		{
			return xbox.getRawAxis(5);
		}
	}
	public double rightXValue(double threshold)
	{ // Gets vertical left joystick value (how far it is pushed up or down)
		if (Math.abs(xbox.getRawAxis(4)) <= threshold)
		{
			return 0;
		}
		else 
		{
			return xbox.getRawAxis(4);
		}
	}


	public static void OI_Method()
	{
	}
}
