package com.strategy;

import com.strategy.captain.CaptainStrategy;
import com.strategy.motor.MotorStrategy;
import com.strategy.sailing.SailingStrategy;

public class Boat {

    private CaptainStrategy captainStrategy;
    private SailingStrategy sailingStrategy;
    private MotorStrategy motorStrategy;

    public Boat(CaptainStrategy captainStrategy, SailingStrategy sailingStrategy, MotorStrategy motorStrategy) {
        this.captainStrategy = captainStrategy;
        this.sailingStrategy = sailingStrategy;
        this.motorStrategy = motorStrategy;
    }

    @Override
    public String toString() {
        return "The boat is " + this.sailingStrategy.getSailsStatus() +
                ", and with its motor " + this.motorStrategy.getMotorStatus() +
                "! The captain " + this.captainStrategy.getCaptainsMind()+"!";
    }
}
