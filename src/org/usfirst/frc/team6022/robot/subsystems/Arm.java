package org.usfirst.frc.team6022.robot.subsystems;

import org.usfirst.frc.team6022.robot.commands.DriveWithXbox;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
<<<<<<< HEAD
	static VictorSP pivot1 = new VictorSP (4);
	static VictorSP pivot2 = new VictorSP (5);
=======
	static VictorSP pivot1 = new VictorSP(4);
	static VictorSP pivot2 = new VictorSP(5);
>>>>>>> origin/Testing
			
	public Arm ()
	{
		super();
	}

	protected void initDefaultCommand() {
		setDefaultCommand(new DriveWithXbox()) ;
	}
<<<<<<< HEAD
	@SuppressWarnings("null")
	public void ArmRotate (Joystick joystick) {
		GenericHID stick = null;
		//drive.arcadeDrive(stick(stick.getY(Hand.kLeft), (stick.getX())));
		
	}

	private GenericHID stick(double y, double d) {
		return null;
	}
	
}
=======
	
	public void driveWithXbox(Joystick joystick1) {
		pivot1.set(joystick1.getY(Hand.kLeft)/10);
		pivot2.set(joystick1.getY(Hand.kRight)/10);
	}	
	
		public void MakeItMove(double inputSpeed)
		{
			//drive.arcadeDrive(inputSpeed,0);
		}
		
		public void MoveNoWhere()
		{
			//drive.arcadeDrive(0,0);
		}
}
>>>>>>> origin/Testing
