package org.usfirst.frc.team2083.commands;

import org.usfirst.frc.team2083.subsytems.DriveSubsystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public abstract class CommandBase extends Command
{

	public static DriveSubsystem driveSubsystem	= new DriveSubsystem();
	
	public static void init()
	{
		SmartDashboard.putData(driveSubsystem);
	}
	
	public CommandBase()
	{
		super();
	}

	public CommandBase(String name)
	{
		super(name);
	}
	
}
