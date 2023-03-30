package org.factory_method;

public class Demo {
    private static Boat boat;

    public static void main(String[] args) {
        configure("HighSeas");
        runBusinessLogic();

        System.out.println("-------");

        configure("Coastal");
        runBusinessLogic();
    }

    static void configure(String type) {
        if (type.equals("HighSeas")) {
            boat = new HighSeasBoat();
        } else {
            boat = new CoastalBoat();
        }
    }

    static void runBusinessLogic() {
        boat.process();
    }
}
