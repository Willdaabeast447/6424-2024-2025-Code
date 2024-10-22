// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.Subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Arm extends SubsystemBase {
  TalonFX Arm_Motor_Left=new TalonFX(0);
  TalonFX Arm_Motor_Right=new TalonFX(1);

  /** Creates a new Arm. */
  public Arm() {
    Arm_Motor_Left.setInverted(false);
    Arm_Motor_Right.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
