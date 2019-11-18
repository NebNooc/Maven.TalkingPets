
package io.zipcoder.polymorphism.animals;

public abstract class Animals {

    private String name;
    //private String type;

    public abstract String speak();

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String[] className;
        className = this.getClass().getName().split("\\.");

        return String.format("\n%s is a %s and sounds like %s",
                this.getName(), className[className.length - 1], this.speak());
    }

}