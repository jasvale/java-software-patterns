package org.prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Sailor> sailors = new ArrayList<>();
        List<Sailor> sailorsCopy = new ArrayList<>();

        WoodenLeg woodenLeg = new WoodenLeg();
        woodenLeg.age = 10;
        woodenLeg.numberOfLegs = 20;
        woodenLeg.handlesKnifes = true;
        woodenLeg.name = "Leggy";
        sailors.add(woodenLeg);

        WoodenLeg anotherWoodenLeg = (WoodenLeg) woodenLeg.clone();
        sailors.add(anotherWoodenLeg);

        Captain captain = new Captain();
        captain.wearsCoolHat = 10;
        captain.hatColor = "Black";
        captain.name = "Blacky";
        sailors.add(captain);

        cloneAndCompare(sailors, sailorsCopy);
    }

    private static void cloneAndCompare(List<Sailor> sailors, List<Sailor> shapesCopy) {
        for (Sailor sailor : sailors) {
            shapesCopy.add(sailor.clone());
        }

        for (int i = 0; i < sailors.size(); i++) {
            if (sailors.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Sailors are indeed different objects.");
                if (sailors.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": Still, they are identical.");
                } else {
                    System.out.println(i + ": And are not identical (they should).");
                }
            } else {
                System.out.println(i + ": Sailor objects are the same (they shouldn't)");
            }
        }
    }
}
