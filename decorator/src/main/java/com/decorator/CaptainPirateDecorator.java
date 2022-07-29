package com.decorator;

public class CaptainPirateDecorator extends PirateDecorator {

    public CaptainPirateDecorator(Pirate pirate) {
        super(pirate);
    }

    public String decorate() {
        return super.decorate() + this.decorateWithCaptain();
    }

    private String decorateWithCaptain() {
        return ">";
    }
}
