package com.strategy;

import com.strategy.captain.CaptainStrategy;
import com.strategy.captain.CautiousCaptionStrategy;
import com.strategy.captain.DrunkCaptainStrategy;
import com.strategy.captain.NormalCaptainStrategy;
import com.strategy.motor.FullMotorStrategy;
import com.strategy.motor.MotorStrategy;
import com.strategy.motor.OffMotorStrategy;
import com.strategy.sailing.DoubleSailStrategy;
import com.strategy.sailing.FullSailsStrategy;
import com.strategy.sailing.MonoSailingStrategy;
import com.strategy.sailing.SailingStrategy;

public class Boat {

    public static void main(String[] args) {
        System.out.println(new Boat(new DrunkCaptainStrategy(), new FullSailsStrategy(), new FullMotorStrategy()));
        System.out.println(new Boat(new NormalCaptainStrategy(), new DoubleSailStrategy(), new OffMotorStrategy()));
        System.out.println(new Boat(new NormalCaptainStrategy(), new MonoSailingStrategy(), new FullMotorStrategy()));
        System.out.println(new Boat(new CautiousCaptionStrategy(), new MonoSailingStrategy(), new OffMotorStrategy()));
    }

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
