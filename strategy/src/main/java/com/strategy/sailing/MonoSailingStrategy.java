package com.strategy.sailing;

public class MonoSailingStrategy implements SailingStrategy {
    @Override
    public String getSailsStatus() {
        return "with only the main sail up";
    }
}
