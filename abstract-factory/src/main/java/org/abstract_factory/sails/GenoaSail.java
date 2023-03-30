package org.abstract_factory.sails;

public class GenoaSail implements Sail {

    @Override
    public void raise() {
        System.out.println("Using the Genoa sail.");
    }
}
