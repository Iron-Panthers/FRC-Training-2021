// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*
 *    Code edited by Landon Stobaugh 3/30/21
 *      Remember, stay cool, and keep on hacking
 */

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private Spark motor1;
  private TalonFX motor2;
  public ExampleSubsystem() {
	  motor1 = new Spark(Constants.ExampleSubsystem.MOTOR_1_PORT); 
	  motor2 = new TalonFX(Constants.ExampleSubsystem.MOTOR_2_PORT);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  
  public void setMotors(double inp_speed)
  {
    // Set the speed of the different motors accordingly
    motor1.set(inp_speed);
    
    // Because the motors are facing opposite directions
    // it's important to invert the spin direction on the opposing motor
    motor2.set(-inp_speed);
  }
}
