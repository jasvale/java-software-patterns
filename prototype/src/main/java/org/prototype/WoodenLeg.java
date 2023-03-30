package org.prototype;

public class WoodenLeg extends Sailor {
    public boolean handlesKnifes;

    public WoodenLeg() {}

    public WoodenLeg(WoodenLeg target) {
        super(target);
        if (target != null) {
            this.handlesKnifes = target.handlesKnifes;
        }
    }

    @Override
    public Sailor clone() {
        return new WoodenLeg(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof WoodenLeg shape2) || !super.equals(object2)) return false;
        return shape2.handlesKnifes == handlesKnifes;
    }
}
