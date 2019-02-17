package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import javax.lang.model.util.ElementScanner6;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class HatchGrabberCommand extends CommandBase
{

	static boolean onceOnly = false;

	public enum Direction{
		OPEN, CLOSE, STOP
	}

	Direction direction;
	float speed = 0.0f;

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
				HatchGrabberCommand.onceOnly = true;
				if (!RobotMap.hatchGripperMotor.getSensorCollection().isRevLimitSwitchClosed()){
					speed += .002f;
					System.out.println("Speed: " + speed);
					RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, speed);
				}
				else{
					speed = 0;
					RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, speed);
					//System.out.println("At Limit");
				}
					
				break;
			case CLOSE:
				HatchGrabberCommand.onceOnly = true;
				if (!RobotMap.hatchGripperMotor.getSensorCollection().isFwdLimitSwitchClosed()){
					speed += .002f;
					System.out.println("Speed: " + speed);
					RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, -speed);
				}
				else{
					speed = 0;
					RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, speed);
					//System.out.println("At Limit");
				}
				break;
			case STOP:
					speed = 0;
					if (HatchGrabberCommand.onceOnly) {
						System.out.println("Button Released");
						HatchGrabberCommand.onceOnly = false;
					}
					RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, speed);
				break;
		}
		//RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, -.4 * (Robot.oi.rightYValue(.25)));
	}

	@Override
	protected boolean isFinished()
	{
		return Direction.STOP == direction;
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
