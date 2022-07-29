package com.decorator;

public class PirateImp implements Pirate {

    @Override
    public String decorate() {
        return "From possible ranking symbols (>, >>, >>>, >>>>), This pirate is: >";
    }

    @Override
    public String toString() {
        return decorate();
    }
}
