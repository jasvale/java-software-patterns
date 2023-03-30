package org.abstract_factory.factories;

import org.abstract_factory.motors.Motor;
import org.abstract_factory.sails.Sail;

public interface BoatFactory {
    Sail raiseSail();

    Motor startMotor();
}
