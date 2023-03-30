package org.prototype;

import java.util.Objects;

public abstract class Sailor {
    public int age;
    public int numberOfLegs;
    public String name;

    public Sailor() {}

    public Sailor(Sailor target) {
        if (target != null) {
            this.age = target.age;
            this.numberOfLegs = target.numberOfLegs;
            this.name = target.name;
        }
    }

    public abstract Sailor clone();

    public boolean equals(Object object2) {
        if (!(object2 instanceof Sailor sailor2)) return false;
        return sailor2.age == age
                && sailor2.numberOfLegs == numberOfLegs
                && Objects.equals(sailor2.name, name);
    }
}
