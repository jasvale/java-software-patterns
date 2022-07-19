package com.state;

public class StateExample {

    /**
     * State Design Pattern
     *
     * Similar to the concept of a Finite-State Machine, this behavioral design pattern allows an object to change its
     *  behaviour when it's internal state changes.
     *
     *  Since it's a Finite-State Machine, some rules apply:
     *      - There must be a finite number of states.
     *      - In a particular state, it's behaviour is unique.
     *      - It should be possible to switch from one state to another instantaneously, as long they are finite and
     *          predetermined.
     * */
    public static void main(String[] args) {
        Kraken kraken = new Kraken();

        AwakeTheKraken awake = new AwakeTheKraken();
        kraken.setState(awake);

        System.out.println(kraken);

        HibernateTheKraken hibernate = new HibernateTheKraken();
        kraken.setState(hibernate);

        System.out.println(kraken);
    }
}
