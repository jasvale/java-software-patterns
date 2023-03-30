package org.abstract_factory;

import org.abstract_factory.factories.BoatFactory;
import org.abstract_factory.factories.DieselBoatFactory;
import org.abstract_factory.factories.ElectricBoatFactory;

public class Demo {

    private static Boat configureBoat(String boatType) {
        Boat app;
        BoatFactory factory;
        if (boatType.equals("Electric")) {
            factory = new ElectricBoatFactory();
        } else {
            factory = new DieselBoatFactory();
        }
        app = new Boat(factory);
        return app;
    }

    public static void main(String[] args) {
        Boat app = configureBoat("Electric");
        app.navigate();
        System.out.println("-----");
        app = configureBoat("Diesel");
        app.navigate();
    }
}
