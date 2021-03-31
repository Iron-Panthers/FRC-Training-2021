// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Drivebase extends SubsystemBase {
    /** Creates a new Drivebase. */
    private TalonFX rightFMotor;
    private TalonFX leftFMotor;
    private TalonFX rightBMotor;
    private TalonFX leftBMotor;

    public Drivebase() {
        // moters be made here
        rightFMotor = new TalonFX(Constants.Drivebase.RIGHTFMOTOR_PORT);
        leftFMotor = new TalonFX(Constants.Drivebase.LEFTFMOTOR_PORT);
        rightBMotor = new TalonFX(Constants.Drivebase.RIGHTBMOTOR_PORT);
        leftBMotor = new TalonFX(Constants.Drivebase.LEFTBMOTOR_PORT);

        // make the back motors follow the front moters
        rightBMotor.follow(rightFMotor);
        leftBMotor.follow(leftFMotor);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
