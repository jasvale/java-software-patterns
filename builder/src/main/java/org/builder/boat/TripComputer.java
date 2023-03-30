package org.builder.boat;

public class TripComputer {

    private Boat boat;

    public void setCar(Boat boat) {
        this.boat = boat;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + boat.getFuel());
    }

    public void showStatus() {
        if (this.boat.getEngine().isStarted()) {
            System.out.println("Boat is started");
        } else {
            System.out.println("Boat isn't started");
        }
    }
}
