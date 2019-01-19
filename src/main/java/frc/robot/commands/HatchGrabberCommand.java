package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class HatchGrabberCommand extends CommandBase
{

	public HatchGrabberCommand()
	{
		super("HatchGrabberCommand");		
	}

	@Override
	protected void initialize()
	{
		// ???
	}

	@Override
	protected void execute()
	{
		RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, -.4 * (Robot.oi.rightYValue(.25)));
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
		System.out.println("HatchGrabberCommand Ended");
	}

	@Override
	protected void interrupted()
	{
		super.interrupted();
		System.out.println("Hatch Interuppted");
	}
	
	public void enableControl()
	{
	}

	public void disableControl()
	{
	}
}
