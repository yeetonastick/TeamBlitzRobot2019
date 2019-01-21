package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class HatchGrabberCommand extends CommandBase
{
	public enum Direction{
		OPEN, CLOSE, STOP
	}

	Direction direction;

	public HatchGrabberCommand(Direction direction)
	{
		super("HatchGrabberCommand");
		this.direction = direction;		
	}
	@Override
	protected void initialize()
	{
		// ???
	}

	@Override
	protected void execute()
	{
		switch (direction)
		{
			case OPEN:
			RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, 0.1);
			break;
			case CLOSE:
			RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, -0.1);
			break;
			case STOP:
			RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, 0.0);
			break;
		}
		//RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, -.4 * (Robot.oi.rightYValue(.25)));
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
