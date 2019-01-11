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

	public static void OI_Method()
	{
	}
}