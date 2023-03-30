package org.abstract_factory.motors;

public class DieselMotor implements Motor {

    @Override
    public void start() {
        System.out.println("Starting the Diesel motor.");
    }
}
