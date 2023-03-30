package org.builder.boat;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "A loxodromic route is set.";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
