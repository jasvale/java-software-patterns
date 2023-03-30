package org.prototype;

public class Captain extends Sailor {
    public int wearsCoolHat;
    public String hatColor;

    public Captain() {}

    public Captain(Captain target) {
        super(target);
        if (target != null) {
            this.wearsCoolHat = target.wearsCoolHat;
            this.hatColor = target.hatColor;
        }
    }

    @Override
    public Sailor clone() {
        return new Captain(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Captain) || !super.equals(object2)) return false;
        Captain shape2 = (Captain) object2;
        return shape2.wearsCoolHat == wearsCoolHat && shape2.hatColor == hatColor;
    }
}
