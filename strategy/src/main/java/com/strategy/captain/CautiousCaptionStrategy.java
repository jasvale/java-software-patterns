package com.strategy.captain;

public class CautiousCaptionStrategy implements CaptainStrategy {

    @Override
    public String getCaptainsMind() {
        return "is cautious, could be rocks ahead";
    }
}
