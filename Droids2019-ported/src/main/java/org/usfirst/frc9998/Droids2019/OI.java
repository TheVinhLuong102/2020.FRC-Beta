// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc9998.Droids2019;

import org.usfirst.frc9998.Droids2019.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc9998.Droids2019.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton x1;
    public JoystickButton joystickButton14;
    public JoystickButton joystickButton13;
    public JoystickButton joystickButton12;
    public Joystick joystick1;
    public JoystickButton xintakeconnectgrabpanel;
    public JoystickButton aintakeconnectshrink;
    public JoystickButton bintakeconnectgrabball;
    public JoystickButton yintakeconnectholdpanel;
    public JoystickButton joystickButton5;
    public JoystickButton joystickButton6;
    public Joystick joystick2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick2 = new Joystick(1);
        
        // joystickButton6 = new JoystickButton(joystick2, 6);
        // joystickButton6.whileHeld(new IntakeRun(0.5));
        // joystickButton5 = new JoystickButton(joystick2, 5);
        // joystickButton5.whileHeld(new IntakeRun(-1.0));
        // yintakeconnectholdpanel = new JoystickButton(joystick2, 4);
        // yintakeconnectholdpanel.whileHeld(new IntakeConnectSet(-0.65));
        // bintakeconnectgrabball = new JoystickButton(joystick2, 3);
        // bintakeconnectgrabball.whenPressed(new IntakeConnectSet(-1.0));
        // aintakeconnectshrink = new JoystickButton(joystick2, 2);
        // aintakeconnectshrink.whenPressed(new IntakeConnectChange(0.05));
        // xintakeconnectgrabpanel = new JoystickButton(joystick2, 1);
        // xintakeconnectgrabpanel.whenPressed(new IntakeConnectSet(-0.45));


        joystick1 = new Joystick(0);
        
        // joystickButton12 = new JoystickButton(joystick1, 2);
        // joystickButton12.whileHeld(new LiftSet(-207));
        // joystickButton13 = new JoystickButton(joystick1, 3);
        // joystickButton13.whileHeld(new LiftSet(-158));
        // joystickButton14 = new JoystickButton(joystick1, 4);
        // joystickButton14.whileHeld(new LiftSet(-90));
        // x1 = new JoystickButton(joystick1, 1);
        // x1.whileHeld(new GoToTarget());


        // SmartDashboard Buttons
        // SmartDashboard.putData("MoveOff", new MoveOff());
        // SmartDashboard.putData("GoToTarget", new GoToTarget());
        // SmartDashboard.putData("GreenLightOn", new GreenLightOn());
        // SmartDashboard.putData("GreenLightOff", new GreenLightOff());
        // SmartDashboard.putData("LiftSet: Bottom", new LiftSet(-10));
        // SmartDashboard.putData("LiftSet: Top", new LiftSet(-280));
        // SmartDashboard.putData("LiftSet: Middle", new LiftSet(-125));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
