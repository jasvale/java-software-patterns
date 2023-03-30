package org.abstract_factory.motors;

public class ElectricMotor implements Motor {

    @Override
    public void start() {
        System.out.println("Starting the electric motor.");
    }
}
