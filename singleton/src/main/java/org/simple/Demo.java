package org.simple;

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Bermudas");
        Singleton anotherSingleton = Singleton.getInstance("Caribbean");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
