package com.template;

public class TemplateExample {

    /**
     * Template Method Design Pattern
     *
     * Allows the definition of a skeleton behavioral algorithm in the superclass
     *  while maintaining the actual implementation in subclasses.
     *
     * This way enforcing the "main" steps by the "templating" in superclass,
     *  but allowing to diverge in behaviour in child classes
     *
     *  Pros:
     *     By changing method visibility, it's possible to allow the manipulation of only certain parts of a larger
     *      algorithm (overriding), whilst keeping the rest locked in the superclass.
     *
     *  Cons:
     *     With increasing number of implementations of the skeleton class, the code will get harder to maintain.
     * */
    public static void main(String[] args) {
        Sea sea = new SunnySeas();
        sea.create();
        System.out.println(sea);

        sea = new StormySeas();
        sea.create();
        System.out.println(sea);
    }
}
