// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class DriveCommand extends CommandBase {
  /** Creates a new DriveCommand. */
  private final Drive drive;
  private final double x, y;

  public DriveCommand(double x, double y, Drive drive) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drive);

    this.drive = drive;
    this.x = x;
    this.y = y;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // set left + right as x + y 
    // x = y --> go forward/backward, x > y --> turn right, x < y --> turn left
    double leftSpeed = x;
    double rightSpeed = y;

    drive.setPower(0.5, 0.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drive.setPower(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
