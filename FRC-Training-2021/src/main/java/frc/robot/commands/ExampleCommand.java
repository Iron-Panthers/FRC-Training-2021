// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*
 *    Code edited by Landon Stobaugh 3/30/21
 *      Remember, stay cool, and keep on hacking
 */

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class ExampleCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  
  // The subsystem we are using
  private final ExampleSubsystem m_subsystem;
  
  // Joystick robot will use (teleoperated)
  private Joystick m_joystick;
  
  // Variables to hold data about joystick positioning
  private double joy_x, joy_y;

  
  public ExampleCommand(ExampleSubsystem subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize()
  {
    // We want to be sure that nothing is moving when we start
    m_subsystem.setMotors(0.0);
    
    // Init the joystick
    m_joystick = new Joystick(JOYSTICK_PORT);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute()
  {
    // Get the different axises
    joy_x = m_joystick.getX();
    joy_y = m_joystick.getY();
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted)
  {
    // Like initing, we want to make sure nothing is moving on exit
    ExampleSubsystem.setMotors(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
