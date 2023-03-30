package org.builder.builders;

import org.builder.boat.BoatType;
import org.builder.boat.Engine;
import org.builder.boat.GPSNavigator;
import org.builder.boat.TripComputer;

public interface Builder {
    void setBoatType(BoatType type);

    void setCapacity(int capacity);

    void setEngine(Engine engine);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
