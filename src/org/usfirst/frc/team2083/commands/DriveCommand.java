package org.usfirst.frc.team2083.commands;

import org.usfirst.frc.team2083.robot.Robot;
import org.usfirst.frc.team2083.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class DriveCommand extends CommandBase
{

	public DriveCommand()
	{
		super("DriveCommand");		
	}

	@Override
	protected void initialize()
	{
		// ???
	}

	@Override
	protected void execute()
	{
		RobotMap.frontLeftMotor.set(ControlMode.PercentOutput, Robot.oi.stickValue());	
		}

	@Override
	protected boolean isFinished()
	{
		return false;
	}

	@Override
	protected void end()
	{
		super.end();
		System.out.println("Drive System Ended");
	}

	@Override
	protected void interrupted()
	{
		super.interrupted();
		System.out.println("Drive System Interuppted");
	}
	
	public void enableControl()
	{
		// Call "enableControl" in DriveSubsytem.java
		driveSubsystem.enableControl();
	}

	public void disableControl()
	{
		// Call "disableControl" in DriveSubsystem.java
		driveSubsystem.disableControl();
	}
}
