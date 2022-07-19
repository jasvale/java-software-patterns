package com.strategy;

import com.strategy.captain.CautiousCaptionStrategy;
import com.strategy.captain.DrunkCaptainStrategy;
import com.strategy.captain.NormalCaptainStrategy;
import com.strategy.motor.FullMotorStrategy;
import com.strategy.motor.OffMotorStrategy;
import com.strategy.sailing.DoubleSailStrategy;
import com.strategy.sailing.FullSailsStrategy;
import com.strategy.sailing.MonoSailingStrategy;

public class StrategyExample {
    public static void main(String[] args) {
        System.out.println(new Boat(new DrunkCaptainStrategy(), new FullSailsStrategy(), new FullMotorStrategy()));
        System.out.println(new Boat(new NormalCaptainStrategy(), new DoubleSailStrategy(), new OffMotorStrategy()));
        System.out.println(new Boat(new NormalCaptainStrategy(), new MonoSailingStrategy(), new FullMotorStrategy()));
        System.out.println(new Boat(new CautiousCaptionStrategy(), new MonoSailingStrategy(), new OffMotorStrategy()));
    }
}
