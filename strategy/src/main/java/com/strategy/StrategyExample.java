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

    /**
     * Strategy Design Pattern
     *
     * This pattern allows the injection of behaviour to classes via interfaces.
     *
     * Pros:
     *      - Scalability issues in inheritance and code re-utilization upon functionality growth and divergence.
     *          - (high nº of child classes with code inheritance but only 60% of code is fully shared between all)
     *      - Allows runtime behaviour change of instanced classes.
     *      - Allows horizontal code scaling (composition), instead of vertical (inheritance).
     *
     * Cons:
     *      - High level of interfaces and classes (one for each strategy), which means lots of files
     *      - If the final algorithm has high nº of strategies, there must some wau to easily fetch the right combo of
     *          strategies to be used, otherwise it can be complicated to select the correct ones.
     * */
    public static void main(String[] args) {
        System.out.println(new Boat(new DrunkCaptainStrategy(), new FullSailsStrategy(), new FullMotorStrategy()));
        System.out.println(new Boat(new NormalCaptainStrategy(), new DoubleSailStrategy(), new OffMotorStrategy()));
        System.out.println(new Boat(new NormalCaptainStrategy(), new MonoSailingStrategy(), new FullMotorStrategy()));
        System.out.println(new Boat(new CautiousCaptionStrategy(), new MonoSailingStrategy(), new OffMotorStrategy()));
    }
}
