package org.abstract_factory.factories;

import org.abstract_factory.motors.ElectricMotor;
import org.abstract_factory.motors.Motor;
import org.abstract_factory.sails.JibSail;
import org.abstract_factory.sails.Sail;

/**
 * Each concrete factory extends basic factory and responsible for creating products of a single
 * variety.
 */
public class ElectricBoatFactory implements BoatFactory {

    @Override
    public Sail raiseSail() {
        return new JibSail();
    }

    @Override
    public Motor startMotor() {
        return new ElectricMotor();
    }
}
