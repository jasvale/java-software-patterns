package org.builder;

import org.builder.boat.Boat;
import org.builder.boat.Manual;
import org.builder.builders.BoatBuilder;
import org.builder.builders.BoatManualBuilder;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        BoatBuilder builder = new BoatBuilder();
        director.constructMotorBoat(builder);

        Boat boat = builder.getResult();
        System.out.println("Boat built:\n" + boat.getCarType());

        BoatManualBuilder manualBuilder = new BoatManualBuilder();
        director.constructMotorBoat(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nBoat manual built:\n" + carManual.print());
    }
}
