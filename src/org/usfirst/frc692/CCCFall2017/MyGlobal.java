package org.usfirst.frc692.CCCFall2017;

public class MyGlobal {
	public enum motorStatus {
		off,
		fwd,
		rev,
	};
	public static motorStatus shooterMotorStatus = motorStatus.off;
	public static motorStatus feederMotorStatus = motorStatus.off;
	public static motorStatus intakeMotorStatus = motorStatus.off;
	public static final int FAST_SPEED = 10;
	public static final int SLOW_SPEED = 5;
	public static final int FEEDER_SPEED = 5;
	public static final int INTAKE_SPEED = 5;
	public static int shooterSpeed = 10;
	
//  semaphore Flags
	public static boolean isIncremented = false;
	public static boolean isDecremented = false;
	public static boolean isFeederPressed = false;
	public static boolean isIntakeForwardPressed = false;
	public static boolean isIntakeReversePressed = false;
}