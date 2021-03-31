// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Spark;

public class Drivebase extends SubsystemBase {
    /** Creates a new Drivebase. */
    private Spark rightMotor;
    private Spark leftMotor;

    public Drivebase() {
        // moters be made here
        rightMotor = new Spark(Constants.Drivebase.RIGHTMOTOR_PORT);
        leftMotor = new Spark(Constants.Drivebase.LEFTMOTOR_PORT);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
