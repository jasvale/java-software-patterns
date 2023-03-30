package org.builder.boat;

public class Boat {
    private final BoatType boatType;
    private final int capacity;
    private final Engine engine;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Boat(
            BoatType boatType,
            int capacity,
            Engine engine,
            TripComputer tripComputer,
            GPSNavigator gpsNavigator) {
        this.boatType = boatType;
        this.capacity = capacity;
        this.engine = engine;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public BoatType getCarType() {
        return boatType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getCapacity() {
        return capacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
