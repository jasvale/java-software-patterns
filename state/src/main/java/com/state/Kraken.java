package com.state;

public class Kraken {
    private KrakenState krakenState;

    public void setState(KrakenState krakenState){
        this.krakenState = krakenState;
    }

    public KrakenState getState() {
        return krakenState;
    }

    @Override
    public String toString() {
        return getState().toString();
    }
}
