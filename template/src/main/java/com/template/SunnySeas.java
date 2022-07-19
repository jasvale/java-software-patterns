package com.template;

public class SunnySeas extends Sea {
    @Override
    String createWave() {
        return "Gentile waves hit the hull";
    }

    @Override
    String createWind() {
        return "the wind kindly pushes against sails";
    }

    @Override
    String ariseTheKraken() {
        return "no sea monsters are to be seen.";
    }
}
