package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

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
		RobotMap.backLeftMotor.follow(RobotMap.frontLeftMotor);
		RobotMap.backRightMotor.follow(RobotMap.frontRightMotor);
		RobotMap.frontLeftMotor.set(ControlMode.PercentOutput, -.96 * (Robot.oi.leftYValue(.25) - Robot.oi.leftXValue(.30)));
		RobotMap.frontRightMotor.set(ControlMode.PercentOutput, 1 * (Robot.oi.leftYValue(.25) + Robot.oi.leftXValue(.30)));
//		RobotMap.frontLeftMotor.set(ControlMode.Velocity, Robot.oi.leftYValue(.15) * 1);
//		RobotMap.frontRightMotor.set(ControlMode.Velocity, 0);
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
