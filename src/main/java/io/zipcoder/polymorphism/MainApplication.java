package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.animals.*;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    Console console = new Console(System.in, System.out);
    Animals[] animals;

    public void run() {

        printInfo(getTypes(getNumberOfPets()));

    }

    public Integer getNumberOfPets(){

        int numberOfPets = console.getIntegerInput("How many pets do you have?");

        return numberOfPets;
    }


    public Animals[] getTypes(int numberOfPets){

        animals = new Animals[numberOfPets];

        for (int index = 0; index < numberOfPets; index++) {
            String type = console.getStringInput("\nWhat type of pet is it?\n" +
                    "Options: Dog, Cat, Cow");
            if ("dog".equals(type.toLowerCase())) {
                animals[index] = new Dog(getName());
            } else if ("cat".equals(type.toLowerCase())) {
                animals[index] = new Cat(getName());
            } else if ("cow".equals(type.toLowerCase())) {
                animals[index] = new Cow(getName());
            } else {
                console.println("\nNot a valid animal.");
                index -= 1;
            }
        }

        return animals;
    }


    public String getName() {

        return console.getStringInput("\nWhat is the pet's name?");
    }


    public void printInfo(Animals[] pets){

        for (Animals pet: pets) {
            console.println(pet.toString());
        }
    }


}