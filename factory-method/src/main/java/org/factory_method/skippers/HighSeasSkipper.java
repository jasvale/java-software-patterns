package org.factory_method.skippers;

public class HighSeasSkipper implements Skipper {

    public void description() {
        System.out.println("High Seas Skipper is in control.");
    }

    public void navigate() {
        description();
        System.out.println("Navigating in giant waves...");
    }
}
