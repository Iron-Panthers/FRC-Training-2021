  public class BeanSubsystem
  {
  // These two functions will be for setting the motors
  public void setMotors(double speed)
  {
    /*MOTOR ORDER:
    
      1##2    ^
      3##4    |
              |
              
     */
    // Set the speed of the different motors accordingly
    motor1.set(speed  * MAX_SPEED);
    motor3.set(speed  * MAX_SPEED);
    
    // Because the motors are facing opposite directions
    // it's important to invert the spin direction on the opposing motor
    motor2.set(-speed  * MAX_SPEED);
    motor4.set(-speed * MAX_SPEED);
  }
  
  public void setMotors(double inp_speed_lft, double inp_speed_rgt)
  {
    // Similar function but taking in 2 variables (for each side)
    motor1.set(speed_lft * MAX_SPEED);
    motor2.set(-speed_rgt * MAX_SPEED);
    motor3.set(speed_lft * MAX_SPEED);
    motor4.set(-speed_rgt * MAX_SPEED);
  }

  }
  
