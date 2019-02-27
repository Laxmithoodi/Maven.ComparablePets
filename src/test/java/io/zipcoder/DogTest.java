package io.zipcoder;
import io.zipcoder.Pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class DogTest  {

    @Before
    public void setUp()  {
    }


    @Test

    public void setNameTest(){
        //Given
        String expName = "Dash!";
       // String expType= "AnimalDog";

        //When
        Dog dog = new Dog(expName);
        String actualName = dog.getName();

        Assert.assertEquals(expName, actualName);


    }

    @Test
    public void speakTest(){
        //Given
        String expSpeak = "Bark!";

        //When
        Dog dog = new Dog(expSpeak);
        String actualSpeak = dog.speak();

        Assert.assertEquals(expSpeak, actualSpeak);

    }


}