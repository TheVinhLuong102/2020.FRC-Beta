// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc9998.Droids2019.subsystems;


import org.usfirst.frc9998.Droids2019.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;

import org.usfirst.frc9998.Droids2019.Robot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
 import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Wrist extends Subsystem {
    private CANEncoder wristEncoder;
    public static boolean folded; 

    private CANPIDController wristPIDController;


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private CANSparkMax wristMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Wrist() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        wristMotor = new CANSparkMax(8, MotorType.kBrushless);
        
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        wristEncoder = wristMotor.getEncoder();
        wristEncoder.setPosition(0.0);
        folded = true;
        wristPIDController = wristMotor.getPIDController();
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new WristJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
        double currentPosition = wristEncoder.getPosition();

        SmartDashboard.putNumber("Wrist encoder", currentPosition);
        if (currentPosition > 35) {
            folded = false;
        } else {
            folded = true;
        }
    }
// 0 folded
// 171 max down
// 34 safe for camera

	public void setPIDValues(double kP, double kI, double kD, double kIz, double kFF, double kMaxOutput,
	double kMinOutput) {
		// /* Set Motion Magic gains in slot0 - see documentation */
		// liftMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder,
		// kPIDLoopIdx, kTimeoutMs);
		// liftMotor.selectProfileSlot(kSlotIdx, kPIDLoopIdx);
		// liftMotor.config_kF(kSlotIdx, kFF, kTimeoutMs);
		// liftMotor.config_kP(kSlotIdx, kP, kTimeoutMs);
		// liftMotor.config_kI(kSlotIdx, kI, kTimeoutMs);
		// liftMotor.config_kD(kSlotIdx, kD, kTimeoutMs);
		
		// /* Set acceleration and vcruise velocity - see documentation */
		// liftMotor.configMotionCruiseVelocity(100000, kTimeoutMs);
		// liftMotor.configMotionAcceleration(100000, kTimeoutMs);
		// /* Zero the sensor */
		// liftMotor.setSelectedSensorPosition(0, kPIDLoopIdx, kTimeoutMs);

		// liftMotor.configurePID(pid, 0, timeoutMs, enableOptimizations);
		
		wristPIDController.setP(kP);
		wristPIDController.setI(kI);
		wristPIDController.setD(kD);
		wristPIDController.setIZone(kIz);
		wristPIDController.setFF(kFF);
		wristPIDController.setOutputRange(kMinOutput, kMaxOutput);
	}

    public void run(double speed) {
        double currentPosition = wristEncoder.getPosition();

        if (speed > 0.0) {
            if (currentPosition > 170.0) {
                speed = 0.0;
            } else if (currentPosition > 120.0) {
                speed = speed * 0.25;
            }
        }
        if (speed < 0.0) {
            if (currentPosition < 5.0) {
                speed = speed * 0.1;
            } else if (currentPosition < 40.0) {
                speed = speed * 0.25;
            }
            if (folded && Robot.lift.high) {
                    speed = 0.0;
            }
        }
        SmartDashboard.putNumber("Wrist", speed);
        wristMotor.set(speed);
    }

	public void setPIDTarget(double target) {
		wristPIDController.setReference(target, ControlType.kPosition);
		// liftMotor.set(ControlMode.MotionMagic, target);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

