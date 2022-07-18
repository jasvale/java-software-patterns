package com.strategy.motor;

public class FullMotorStrategy implements MotorStrategy {

    @Override
    public String getMotorStatus() {
        return "running at full throttle";
    }
}
