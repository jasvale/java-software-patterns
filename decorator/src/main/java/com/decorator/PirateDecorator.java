package com.decorator;

public abstract class PirateDecorator implements Pirate {
    private final Pirate pirate;

    public PirateDecorator(Pirate pirate) {
        this.pirate = pirate;
    }

    @Override
    public String decorate() {
        return pirate.decorate();
    }
}
