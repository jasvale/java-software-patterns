package org.builder;

import org.builder.boat.BoatType;
import org.builder.boat.Engine;
import org.builder.boat.GPSNavigator;
import org.builder.boat.TripComputer;
import org.builder.builders.Builder;

public class Director {

    public void constructMotorBoat(Builder builder) {
        builder.setBoatType(BoatType.MOTOR_BOAT);
        builder.setCapacity(25);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSailingBoat(Builder builder) {
        builder.setBoatType(BoatType.SAILING_BOAT);
        builder.setCapacity(11);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructRowingBoat(Builder builder) {
        builder.setBoatType(BoatType.ROWING_BOAT);
        builder.setCapacity(6);
    }
}
