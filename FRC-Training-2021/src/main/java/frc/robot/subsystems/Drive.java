// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drive extends SubsystemBase {
  /** Creates a new Drive. */
  private WPI_TalonFX left_follow = new WPI_TalonFX(Constants.DriveSubsystem.MOTOR_1_FOLLOW);
  private WPI_TalonFX left_leader = new WPI_TalonFX(Constants.DriveSubsystem.MOTOR_1_LEADER);
  private WPI_TalonFX right_leader = new WPI_TalonFX(Constants.DriveSubsystem.MOTOR_2_LEADER);
  private WPI_TalonFX right_follow = new WPI_TalonFX(Constants.DriveSubsystem.MOTOR_2_FOLLOW);

  public Drive() {
    // make follower motors follow leader motors
    left_leader.follow(left_follow);
    right_leader.follow(right_follow);
  }

  // set motor power
  public void setPower(double leftPower, double rightPower) {
    left_leader.set(TalonFXControlMode.PercentOutput, leftPower);
    right_leader.set(TalonFXControlMode.PercentOutput, rightPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
