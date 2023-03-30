package org.builder.boat;

/**
 * Car manual is another product. Note that it does not have the same ancestor as a Car. They are
 * not related.
 */
public class Manual {
    private final BoatType boatType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(
            BoatType boatType,
            int seats,
            Engine engine,
            Transmission transmission,
            TripComputer tripComputer,
            GPSNavigator gpsNavigator) {
        this.boatType = boatType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of boat: " + boatType + "\n";
        info += "Capacity: " + seats + "\n";
        info +=
                "Engine: volume - "
                        + engine.getVolume()
                        + "; mileage - "
                        + engine.getMileage()
                        + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
