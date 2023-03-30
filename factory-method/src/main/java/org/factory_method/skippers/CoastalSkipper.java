package org.factory_method.skippers;

public class CoastalSkipper implements Skipper {

    public void description() {
        System.out.println("Coastal Skipper is in control.");
    }

    public void navigate() {
        description();
        System.out.println("Navigating...");
    }
}
