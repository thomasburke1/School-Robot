//Subsystem of the Arm

package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
	static VictorSP pivot1 = new VictorSP (4);
	static VictorSP pivot2 = new VictorSP (5);
			
	public Arm ()
	{
		super();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand (new org.usfirst.frc.team6022.robot.commands.ArmRotate()) ;
	}
	@SuppressWarnings("null")
	public void ArmRotate (Joystick joystick) {
		GenericHID stick = null;
		//drive.arcadeDrive(stick(stick.getY(Hand.kLeft), (stick.getX())));
		
	}

	private GenericHID stick(double y, double d) {
		return null;
	}
	
}
