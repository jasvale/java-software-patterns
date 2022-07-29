package com.decorator;

public class FirstMatePirateDecorator extends PirateDecorator {

    public FirstMatePirateDecorator(Pirate pirate) {
        super(pirate);
    }

    @Override
    public String decorate() {
        return super.decorate() + this.decorateFirstMaster();
    }

    public String decorateFirstMaster() {
        return ">";
    }
}