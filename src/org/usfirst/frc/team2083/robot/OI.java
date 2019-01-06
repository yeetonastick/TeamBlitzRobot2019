package org.usfirst.frc.team2083.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

public class OI
{
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

	public double stickValue()
	{ // Gets horizontal left joystick value (how far it is pushed left or right)
		return xbox.getY();
	}

	public double getMotorDriveForwardBackValue()
	{ // Gets vertical left joystick value (how far it is pushed up or down)
		return -xbox.getY();
	}

	public static void OI_Method()
	{
	}
}