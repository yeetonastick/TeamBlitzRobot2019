package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class PneumaticCommand extends CommandBase
{
	public enum Direction{
		OPEN, CLOSE, STOP
	}

	Direction direction;

	public PneumaticCommand(Direction direction)
	{
		super("PneumaticCommand");
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
            RobotMap.exampleDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);
			break;
            case CLOSE:
            RobotMap.exampleDoubleSolenoid.set(DoubleSolenoid.Value.kForward);
            break;
            case STOP:
            RobotMap.exampleDoubleSolenoid.set(DoubleSolenoid.Value.kOff);
            break;
		}
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
	}

	@Override
	protected void interrupted()
	{
		super.interrupted();
	}
	
	public void enableControl()
	{
	}

	public void disableControl()
	{
	}
}
