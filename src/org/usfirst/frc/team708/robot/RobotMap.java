package org.usfirst.frc.team708.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

//import edu.wpi.first.wpilibj.SPI.Port;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * @author omn0mn0m
 *  pushed 1/26/2018
 *  */
public class RobotMap {
	
	// Gamepad USB ports
	public static final int driverGamepad   = 0;
	public static final int operatorGamepad = 1;
	
	// PWM Ports
	public static final int INTAKE_MOTOR 	= 0;
//	public static final int 			 	= 1;
//	public static final int  			 	= 2;
//	public static final int  				= 3;
//	public static final int  				= 4;
//	public static final int  				= 5;
//	public static final int  				= 6;
//	public static final int  				= 7;
//	public static final int  				= 8;
//	public static final int  				= 9;
	
	// Drivetrain CAN Device IDs
	public static final int drivetrainLeftMotorMaster  	= 11;
	public static final int drivetrainLeftMotorSlave1  	= 12;
	public static final int drivetrainLeftMotorSlave2	= 13;
	
	public static final int drivetrainRightMotorMaster  = 14;
	public static final int drivetrainRightMotorSlave1 	= 15;
	public static final int drivetrainRightMotorSlave2 	= 16;

	public static final int telescopingMotorMaster	 	= 21;
	public static final int telescopingMotorSlave1	 	= 22;
	public static final int telescopingMotorSlave2	 	= 23;
	public static final int telescopingMotorSlave3	 	= 24;

	// Pivot Arm CAN Device ID
	public static final int pivotArmMotorMaster			= 31;
	public static final int pivotArmMotorSlave1			= 32;
	
	// Digital IO
	public static final int drivetrainEncoderARt		= 0;  	//this might go directly on the motor controllers
	public static final int drivetrainEncoderBRt		= 1;	//this might go directly on the motor controllers
	public static final int drivetrainEncoderALeft		= 2;	//this might go directly on the motor controllers
	public static final int drivetrainEncoderBLeft		= 3;	//this might go directly on the motor controllers
	public static final int pivotArmEncoderA			= 4;	//this might go directly on the motor controllers
	public static final int pivotArmEncoderB			= 5;	//this might go directly on the motor controllers
	public static final int telescopeEncoderA			= 6;	//this might go directly on the motor controllers
	public static final int telescopeEncoderB			= 7;	//this might go directly on the motor controllers
	public static final int colorSensor			 		= 8;  
//	public static final int pivotArmDownSwitch	 		= 9;  	//might be on motor controller
	public static final int TelescopeDownSwitch			= 9;	//might be on motor controller
	
	// RELAY
//	public static final int 			 	= 0;
//	public static final int 			 	= 1;
//	public static final int 			 	= 2;
//	public static final int 			 	= 3;
	
	//Analog sesnor IDs
//	public static final int armPotentiometer	= 0;
//	public static final int DTSonar				= 1;
//	public static final int loaderIRSensor		= 2;
	
	// PCM Ports
	public static final int shifterLow		= 0; 	//Shifts Drivetrain to Low gear
    public static final int shifterHigh		= 1; 	//Shifts Drivetrain to High gear
    public static final int butterflyShift	= 2;	//Drops Onmi Wheels
//	public static final int openGrabber		= 3;	//Open Grabber
//	public static final int closeGrabber	= 4;	//Close Grabber
//	public static final int telescopeLow	= 5;	//shifts Telescope to Low Gear
//	public static final int telescopeHigh	= 6;	//Shifts Telescope to High Gear
//	public static final int = 7;
	
	
}
