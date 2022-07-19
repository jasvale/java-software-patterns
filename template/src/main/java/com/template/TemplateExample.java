package com.template;

public class TemplateExample {
    public static void main(String[] args) {
        Sea sea = new SunnySeas();
        sea.create();
        System.out.println(sea);
        sea = new StormySeas();
        sea.create();
        System.out.println(sea);
    }
}
