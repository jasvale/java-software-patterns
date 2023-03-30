package org.factory_method;

import org.factory_method.skippers.HighSeasSkipper;
import org.factory_method.skippers.Skipper;

public class HighSeasBoat extends Boat {

    @Override
    public Skipper createSkipper() {
        return new HighSeasSkipper();
    }
}
