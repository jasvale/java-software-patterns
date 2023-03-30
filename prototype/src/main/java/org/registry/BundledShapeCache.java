package org.registry;

import org.prototype.Captain;
import org.prototype.Sailor;
import org.prototype.WoodenLeg;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Sailor> cache = new HashMap<>();

    public BundledShapeCache() {
        WoodenLeg woodenLeg = new WoodenLeg();
        woodenLeg.age = 10;
        woodenLeg.numberOfLegs = 20;
        woodenLeg.handlesKnifes = true;
        woodenLeg.name = "Leggy";

        Captain captain = new Captain();
        captain.wearsCoolHat = 10;
        captain.hatColor = "Black";
        captain.name = "Blacky";

        cache.put("Wooden Leg", woodenLeg);
        cache.put("Captain", captain);
    }

    public Sailor put(String key, Sailor shape) {
        cache.put(key, shape);
        return shape;
    }

    public Sailor get(String key) {
        return cache.get(key).clone();
    }
}
