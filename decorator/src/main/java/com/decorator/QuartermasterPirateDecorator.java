package com.decorator;

public class QuartermasterPirateDecorator extends PirateDecorator {

    public QuartermasterPirateDecorator(Pirate pirate) {
        super(pirate);
    }

    @Override
    public String decorate() {
        return super.decorate() + this.decorateWithQuarterMaster();
    }

    public String decorateWithQuarterMaster() {
        return ">";
    }
}
