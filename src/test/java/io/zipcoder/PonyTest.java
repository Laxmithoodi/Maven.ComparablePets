package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;



public class PonyTest {

    @Test
    public void testNullaryConstructor(){
        //Given
        String expectedName = "";

        Pony pony = new Pony(expectedName);
        pony.setName(expectedName);

        String actualName = pony.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test

    public void setNameTest() {
        //Given
        String expName = "jojosiwa!";
        String expType = "AnimalPony";

        //When
        Pony pony = new Pony(expName);
        pony.setName(expName);
        String actualName = pony.getName();

        Assert.assertEquals(expName, actualName);


    }

    @Test
    public void speakTest() {
        //Given
        String expSpeak = "hehehe";
        String name1 = "jojosiwa";
        String expType = "AnimalPony";

        //When
        Pony pony = new Pony(name1);
        String actualSpeak = pony.speak();

        Assert.assertEquals(expSpeak, actualSpeak);

    }
}



