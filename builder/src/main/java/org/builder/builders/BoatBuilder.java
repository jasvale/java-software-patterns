package org.builder.builders;

import org.builder.boat.*;

public class BoatBuilder implements Builder {
    private BoatType type;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setBoatType(BoatType type) {
        this.type = type;
    }

    @Override
    public void setCapacity(int capacity) {
        this.seats = capacity;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Boat getResult() {
        return new Boat(type, seats, engine, tripComputer, gpsNavigator);
    }
}
