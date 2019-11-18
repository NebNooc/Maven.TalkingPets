
package io.zipcoder.polymorphism.animals;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "woof!";
    }
}