package org.usfirst.frc.team708.robot.commands.autonomous;

import org.usfirst.frc.team708.robot.commands.drivetrain.*;
import org.usfirst.frc.team708.robot.commands.intakeCube.*;
import org.usfirst.frc.team708.robot.Robot;
import org.usfirst.frc.team708.robot.commands.arm.*;
import org.usfirst.frc.team708.robot.commands.autonomous.*;
import org.usfirst.frc.team708.robot.commands.telescope.*;
import org.usfirst.frc.team708.robot.commands.pneumatics.*;
import org.usfirst.frc.team708.robot.commands.visionProcessor.*;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 * this runs the automode for:
 * Start On Side of Field from driver station view 	= LEFT
 * SwitchLocation 									= RIGHT
 * ScaleLocation 									= RIGHT
 */
public class autoLeft_RR extends CommandGroup {

    public autoLeft_RR() {
  
    	// put this here in case you want to just do a drive straight over the line
    	
    	addSequential(new SqueezeCubeAuto()); /*intake closed*/
    	addSequential(new GearShift1());
    	addSequential(new ShiftClimberHigh());
    	
    	// drive to the scale
     	addSequential(new DriveCurvatureToEncoderOrTime(1.0, .03, false, 190, 4));   	
    	addSequential(new TurnToDegrees(.8, 55));
       	addSequential(new DriveStraightToEncoderDistanceOrTime(151, .8, true, 4));	
    	addSequential(new TurnToDegrees(.8, -80));
    	
    	// move arm and tele up and continue to the scale    	
    	addParallel(new ControlArmToScale());
    	addSequential(new ControlTeleToScale());
    	addSequential(new DriveStraightToEncoderDistanceOrTime(60, .6, true, 4));
    	
    	// drop 1st cube in scale 
    	addSequential(new ReleaseCubeAuto());
    	addSequential(new WaitCommand(1.0));
		addSequential(new DriveStraightToEncoderDistanceOrTime(30, .6, false, 1));
		
		// turn towards the cubes and get ready to intake
		addSequential(new ControlTeleToGround());
		
    	addSequential(new TurnToDegrees(1.0, -142));
    	addSequential(new FindCube(1.0));

		addSequential(new ControlArmToGround());
    	
    	// vision track the cube and intake
//    	addSequential(new FindCube());
    	addParallel(new AutoIntakeIn(2.0));    	
    	addSequential(new DriveStraightToEncoderDistanceOrTime(30, .8, true, 2));
    	
//    	// drop 2nd cube into the switch
    	addSequential(new ReleaseCubeAuto());
    	addSequential(new ControlArmToSwitch(2.0));
    	addSequential(new DriveStraightToEncoderDistanceOrTime(12, .8, true, 1));
    	addSequential(new AutoIntakeOut(.5));

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
