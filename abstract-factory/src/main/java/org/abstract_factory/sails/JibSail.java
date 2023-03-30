package org.abstract_factory.sails;

public class JibSail implements Sail {

    @Override
    public void raise() {
        System.out.println("Using the Genoa sail.");
    }
}
