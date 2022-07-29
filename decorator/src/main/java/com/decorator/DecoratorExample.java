package com.decorator;

public class DecoratorExample {

    /**
     * Decorator Design Pattern
     *
     * Allows to dynamically enrich the functionality and/or behaviour of an object without affecting that same class
     *  without changing other objects of the same class.
     * */
    public static void main(String[] args) {
        Pirate pirate = new PirateImp();
        System.out.println(pirate.decorate());

        Pirate quarterMaster = new QuartermasterPirateDecorator(new PirateImp());
        System.out.println(quarterMaster.decorate());

        Pirate firstMate = new FirstMatePirateDecorator(new QuartermasterPirateDecorator(new PirateImp()));
        System.out.println(firstMate.decorate());

        Pirate captain = new CaptainPirateDecorator(new FirstMatePirateDecorator(new QuartermasterPirateDecorator(new PirateImp())));
        System.out.println(captain.decorate());
    }
}
