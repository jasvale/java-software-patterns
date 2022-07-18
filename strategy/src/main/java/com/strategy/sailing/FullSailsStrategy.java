package com.strategy.sailing;

public class FullSailsStrategy implements SailingStrategy {
    @Override
    public String getSailsStatus() {
        return "with all sails up";
    }
}
