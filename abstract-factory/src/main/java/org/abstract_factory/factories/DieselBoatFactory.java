package org.abstract_factory.factories;

import org.abstract_factory.motors.DieselMotor;
import org.abstract_factory.motors.Motor;
import org.abstract_factory.sails.GenoaSail;
import org.abstract_factory.sails.Sail;

/**
 * Each concrete factory extends basic factory and responsible for creating products of a single
 * variety.
 */
public class DieselBoatFactory implements BoatFactory {

    @Override
    public Sail raiseSail() {
        return new GenoaSail();
    }

    @Override
    public Motor startMotor() {
        return new DieselMotor();
    }
}
