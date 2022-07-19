package com.template;

public abstract class Sea {
    private String createdSea;

    abstract String createWave();
    abstract String createWind();
    abstract String ariseTheKraken();

    public void create() {
        String sBldr = createWave() +
                ", " +
                createWind() +
                ", we look ahead and " +
                ariseTheKraken();
        createdSea = sBldr;
    }

    @Override
    public String toString() {
        return createdSea;
    }
}
