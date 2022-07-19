package com.template;

public class StormySeas extends Sea {
    @Override
    String createWave() {
        return "Giant waves almost capsize the boat";
    }

    @Override
    String createWind() {
        return "the wind is bending the mast";
    }

    @Override
    String ariseTheKraken() {
        return "amidst a giant wave, a shadow is seen! 10 times bigger than a man, the kraken is coming!";
    }
}
