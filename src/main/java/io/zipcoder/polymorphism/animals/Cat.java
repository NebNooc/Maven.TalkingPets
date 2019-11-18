
package io.zipcoder.polymorphism.animals;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow!";
    }
}