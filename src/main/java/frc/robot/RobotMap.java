/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

// import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  /*
	 * Motor IDs
	 */
	
	// Drive System Motors
	public static TalonSRX frontLeftMotor = new TalonSRX(2); // 2
	static {
		frontLeftMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		frontLeftMotor.setSensorPhase(true); //Positive velocity corresponds to green light on Talon
		frontLeftMotor.setInverted(false);
		frontLeftMotor.configNominalOutputForward(0, 10);
		frontLeftMotor.configNominalOutputReverse(0, 10);
		frontLeftMotor.configPeakOutputForward(1, 10);
		frontLeftMotor.configPeakOutputReverse(-1, 10);
		frontLeftMotor.configAllowableClosedloopError(0, 0, 10);
		frontLeftMotor.config_kF(0, 0.0, 10);
		frontLeftMotor.config_kP(0, 1.5, 10);
		frontLeftMotor.config_kI(0, 0.02, 10);
		frontLeftMotor.config_kD(0,-0.01, 10);
		frontLeftMotor.setSelectedSensorPosition(0, 0, 10);
		//frontLeftMotor.configPulseWidthPeriod_EdgesPerRot(pulseWidthPeriod_EdgesPerRot, timeoutMs);
	}
	public static TalonSRX frontRightMotor = new TalonSRX(1); // 1
	static {
		frontRightMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		frontRightMotor.setSensorPhase(true);
		frontRightMotor.setInverted(false);
		frontRightMotor.configNominalOutputForward(0, 10);
		frontRightMotor.configNominalOutputReverse(0, 10);
		frontRightMotor.configPeakOutputForward(1, 10);
		frontRightMotor.configPeakOutputReverse(-1, 10);
		frontRightMotor.configAllowableClosedloopError(0, 0, 10);
		frontRightMotor.config_kF(0, 0.0, 10);
		frontRightMotor.config_kP(0, 1.5, 10);
		frontRightMotor.config_kI(0, 0.02, 10);
		frontRightMotor.config_kD(0, -0.01, 10);
		frontRightMotor.setSelectedSensorPosition(0, 0, 10);
	}
	
	public static TalonSRX hatchGripperMotor = new TalonSRX(3);

	public static VictorSPX	backRightMotor	= new VictorSPX(5);	// 5 (Slave)
	public static VictorSPX	backLeftMotor	= new VictorSPX(6);	// 6 (Slave)
	
	/*
	 * Joystick IDs
	 */

	// XBox Controller ID
	static Joystick xBoxController = new Joystick(0); // 0

	// XBox Joystick IDs



	// XBox ABXY Button IDs
	public static Button	ButtonA	= new JoystickButton(xBoxController, 1);	// 1
	public static Button	ButtonB	= new JoystickButton(xBoxController, 2);	// 2
	public static Button	ButtonX	= new JoystickButton(xBoxController, 3);	// 3
	public static Button	ButtonY	= new JoystickButton(xBoxController, 4);	// 4

	// XBox Bumper IDs
	public static Button	LBumper	= new JoystickButton(xBoxController, 5);	// 5
	public static Button	RBumper	= new JoystickButton(xBoxController, 6);	// 6

	// XBox Miscellaneous IDs
	public static Button	Back	= new JoystickButton(xBoxController, 7);	// 7
	public static Button	Start	= new JoystickButton(xBoxController, 8);	// 8
	public static double	POV		= xBoxController.getPOV();					// "N/A"

	/*
	 * Other IDs
	 */

	// Limit Switch IDs
	
	// Game Data
	public static String gameData;
}
