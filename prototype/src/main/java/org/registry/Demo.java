package org.registry;

import org.prototype.Sailor;

public class Demo {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Sailor shape1 = cache.get("Wooden Leg");
        Sailor shape2 = cache.get("Captain");
        Sailor shape3 = cache.get("Captain");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Wooden Leg != Captain indeed.");
        } else {
            System.out.println("Wooden Leg == Captain indeed. (shouldn't)");
        }

        if (shape2 != shape3) {
            System.out.println("Both Captains are two different objects indeed.");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical.");
            } else {
                System.out.println("But they are not identical (shouldn't)");
            }
        } else {
            System.out.println("Objects are the same (shouldn't)");
        }
    }
}
