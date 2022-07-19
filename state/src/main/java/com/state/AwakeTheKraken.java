package com.state;

public class AwakeTheKraken implements KrakenState {

    @Override
    public void apply(Kraken kraken) {
        kraken.setState(this);
    }

    @Override
    public String toString(){
        return "The kraken has been awakened!";
    }
}
