package org.factory_method;

import org.factory_method.skippers.CoastalSkipper;
import org.factory_method.skippers.Skipper;

public class CoastalBoat extends Boat {

    @Override
    public Skipper createSkipper() {
        return new CoastalSkipper();
    }
}
