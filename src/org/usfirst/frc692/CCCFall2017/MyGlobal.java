package org.usfirst.frc692.CCCFall2017;

import edu.wpi.cscore.VideoSource;

public class MyGlobal {
//	Enum Data Types

	public enum MotorStatus {
		off,
		fwd,
		rev
	};
	public enum DriveModes {
		arcade(0, "Arcade"),
		mecanum(1, "Mechanum"),
		tank(2, "Tank");
		
		private int _value = 0;
		private String _display = "";
		
		DriveModes(int value, String display) {
			this._value = value;
			this._display = display;
		}
		
		public int getValue() {
			return this._value;
		}
		
		public String toString() {
			return this._display;
		}
	};
	public enum ArcadeTypes {
		simple(0, "Simple 1"),
		simpleWithTwist(1, "Simple With Twist 1"),
		squared(2, "Squared 1"),
		squaredWithDeadZone(3, "Squared With Dead Zone 1");

		private int _value = 0;
		private String _display = "";
		
		ArcadeTypes(int value, String display) {
			this._value = value;
			this._display = display;
		}
		
		public int getValue() {
			return this._value;
		}
		
		public String toString() {
			return this._display;
		}
	};
	public enum MecanumTypes {
		simple(0, "Simple 2"),
		squared(1, "Squared 2");

		private int _value = 0;
		private String _display = "";
		
		MecanumTypes(int value, String display) {
			this._value = value;
			this._display = display;
		}
		
		public int getValue() {
			return this._value;
		}
		
		public String toString() {
			return this._display;
		}	
	};
	public enum TankTypes {
		simple(0, "Simple 3"),
		squared(1, "Squared 3");

		private int _value = 0;
		private String _display = "";
		
		TankTypes(int value, String display) {
			this._value = value;
			this._display = display;
		}
		
		public int getValue() {
			return this._value;
		}
		
		public String toString() {
			return this._display;
		}
	};
	
//	Global Variables
	public static DriveModes driveModeSelected = DriveModes.arcade;
	public static ArcadeTypes arcadeTypeSelected = ArcadeTypes.simple;
	public static MecanumTypes mecanumTypeSelected = MecanumTypes.simple;
	public static TankTypes tankTypeSelected = TankTypes.simple;
	public static MotorStatus shooterMotorStatus = MotorStatus.off;
	public static MotorStatus feederMotorStatus = MotorStatus.off;
	public static MotorStatus intakeMotorStatus = MotorStatus.off;
	public static MotorStatus climberMotorStatus = MotorStatus.off;
	public static final int FAST_SPEED = 10;
	public static final int SLOW_SPEED = 5;
	public static final int FEEDER_SPEED = 5;
	public static final int INTAKE_SPEED = 5;
	public static final double DEAD_ZONE = (double)(0.0125);
	public static final double TWIST_ADJUSTMENT = (double)(1.25);
	public static final double CLIMBER_SPEED = (double)(0.8);
	public static final String DRIVE_MODE_DISPLAY = "Drive Mode";
	public static final String MODE_TYPE_DISPLAY = "Mode Type";
	public static final String CAMERA_1_STATUS_DISPLAY = "Camera_1_";
	public static final String CAMERA_2_STATUS_DISPLAY = "Camera_2_";
	public static final String CAMERA_3_STATUS_DISPLAY = "Camera_3_";
	public static int shooterSpeed = 10;
	
//  Semaphore Flags
	public static boolean isIncremented = false;
	public static boolean isDecremented = false;
	public static boolean isFeederPressed = false;
	public static boolean isIntakeForwardPressed = false;
	public static boolean isIntakeReversePressed = false;
	public static boolean isDriveModePressed = false;
	public static boolean isModeTypePressed = false;
	public static boolean isClimberPressed = false;
	}