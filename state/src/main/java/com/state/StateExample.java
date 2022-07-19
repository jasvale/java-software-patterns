package com.state;

public class StateExample {
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
