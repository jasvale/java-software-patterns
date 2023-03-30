package org.abstract_factory;

import org.abstract_factory.factories.BoatFactory;
import org.abstract_factory.motors.Motor;
import org.abstract_factory.sails.Sail;

public class Boat {
    private Sail sail;
    private Motor motor;

    public Boat(BoatFactory factory) {
        sail = factory.raiseSail();
        motor = factory.startMotor();
    }

    public void navigate() {
        sail.raise();
        motor.start();
    }
}
