
package io.zipcoder.polymorphism.animals;

public class Cow extends Animals {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "moo!";
    }
}