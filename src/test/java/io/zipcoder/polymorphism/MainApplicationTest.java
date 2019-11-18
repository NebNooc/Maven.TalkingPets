package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {

    MainApplication testApp;

    @Before
    public void pets() {
        testApp = new MainApplication();
    }

    @Test
    public void addPet() {

        testApp.getTypes(2);
        int expected = 2;
        int actual = testApp.animals.length;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfPets() {

        
    }
}
