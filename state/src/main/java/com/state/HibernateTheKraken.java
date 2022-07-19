package com.state;

public class HibernateTheKraken implements KrakenState {
    @Override
    public void apply(Kraken kraken) {
        kraken.setState(this);
    }

    @Override
    public String toString(){
        return "The kraken went to sleep.";
    }
}
