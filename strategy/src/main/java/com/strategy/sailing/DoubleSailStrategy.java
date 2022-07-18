package com.strategy.sailing;

public class DoubleSailStrategy implements SailingStrategy {
    @Override
    public String getSailsStatus() {
        return "with both main sails up";
    }
}
