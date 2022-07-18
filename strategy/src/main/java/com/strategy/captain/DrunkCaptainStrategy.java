package com.strategy.captain;

public class DrunkCaptainStrategy implements CaptainStrategy {
    @Override
    public String getCaptainsMind() {
        return "seems crazy, must be drunk!";
    }
}
