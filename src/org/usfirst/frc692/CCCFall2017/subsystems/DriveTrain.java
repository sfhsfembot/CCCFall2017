// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.CCCFall2017.subsystems;

import org.usfirst.frc692.CCCFall2017.MyGlobal;
import org.usfirst.frc692.CCCFall2017.Robot;
import org.usfirst.frc692.CCCFall2017.RobotMap;
import org.usfirst.frc692.CCCFall2017.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftFrontSpeedController_PWM_4 = RobotMap.driveTrainLeftFrontSpeedController_PWM_4;
    private final SpeedController rightFrontSpeedController_PWM_5 = RobotMap.driveTrainRightFrontSpeedController_PWM_5;
    private final SpeedController leftRearSpeedController_PWM_6 = RobotMap.driveTrainLeftRearSpeedController_PWM_6;
    private final SpeedController rightRearSpeedController_PWM_7 = RobotMap.driveTrainRightRearSpeedController_PWM_7;
    private final RobotDrive robotDrive41 = RobotMap.driveTrainRobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithOneJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveWithJoystick(Joystick joystick) {
    	double xAxis = joystick.getX();
    	double yAxis = joystick.getY();
    	double twist = joystick.getTwist();
    	
    	switch (MyGlobal.driveModeSelected) {
	    	case arcade:
	    		switch (MyGlobal.arcadeTypeSelected) {
		    		case simple:
		    			RobotMap.driveTrainRobotDrive41.arcadeDrive(joystick);
		    			break;
		    		case simpleWithTwist:
		    			RobotMap.driveTrainRobotDrive41.arcadeDrive(joystick.getY(), joystick.getTwist());
		    			break;
		    		case squared:
		    			RobotMap.driveTrainRobotDrive41.arcadeDrive(joystick.getY(), joystick.getTwist(), true);
		    			break;
		    		case squaredWithDeadZone:
		    			RobotMap.driveTrainRobotDrive41.arcadeDrive(determineValueWithDeadZone(joystick.getY()), determineValueWithDeadZone(joystick.getTwist()), true);
		    			break;
	    		}
	    		break;
	    		
	    	case mecanum:
	    		switch (MyGlobal.mecanumTypeSelected) {
		    		case simple:
		    			break;
		    		case squared:
		    			break;
	    		}
	    		break;
	    		
	    	case tank:
	    		switch (MyGlobal.tankTypeSelected) {
		    		case simple:
		    			break;
		    		case squared:
		    			break;
	    		}
	    		break;
    	}
    	
    	// TODO: Need to test different drive parameters.
    }
    
    private double determineValueWithDeadZone (double value) {
    	return ((Math.abs(value) < MyGlobal.DEAD_ZONE) ? 0 : value);
    }
}

