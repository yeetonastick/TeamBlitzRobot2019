package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import javax.lang.model.util.ElementScanner6;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class HatchGrabberCommand extends CommandBase
{

	//static boolean onceOnly = false; Delete if not broken

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
				//HatchGrabberCommand.onceOnly = true;
				// if (!RobotMap.hatchGripperMotor.getSensorCollection().isRevLimitSwitchClosed()){
				// 	speed += .002f;
				// 	RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, speed);
				// }
				// else{
				// 	speed = 0;
				// 	RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, speed);
				//}
				RobotMap.hatchGripperMotor.set(ControlMode.Position, 8500);
					
				break;
			case CLOSE:
			if (!RobotMap.hatchGripperMotor.getSensorCollection().isFwdLimitSwitchClosed()){
				RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, -.3);
			}
			else{
				//RobotMap.hatchGripperMotor.setSelectedSensorPosition(0, 0, 10);
				RobotMap.hatchGripperMotor.set(ControlMode.PercentOutput, 0);
			}
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
