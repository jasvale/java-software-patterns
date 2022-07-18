package com.strategy.motor;

public class OffMotorStrategy implements MotorStrategy {
    @Override
    public String getMotorStatus() {
        return "is off";
    }
}
