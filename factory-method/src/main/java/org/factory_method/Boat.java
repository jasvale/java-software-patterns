package org.factory_method;

import org.factory_method.skippers.Skipper;

public abstract class Boat {

    public void process() {
        // more logic

        Skipper skipper = createSkipper();
        skipper.navigate();
    }

    public abstract Skipper createSkipper();
}
