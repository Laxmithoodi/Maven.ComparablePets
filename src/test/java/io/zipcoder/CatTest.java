package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {


    @Before
    public void setUp(){

    }


    @Test

    public void setNameTest(){
    //Given
    String expName = "tracy!";
    String expType = "AnimalCat";

    //When
      Cat cat = new Cat(expName) ;
      cat.setName(expName);
      String actualName = cat.getName();

        Assert.assertEquals(expName, actualName);


    }

    @Test
    public void speakTest(){
     //Given
     String expSpeak = "Meow!";
        String expType = "AnimalCat";

     //When
        Cat cat = new Cat(expSpeak) ;
        String actualSpeak = cat.speak();

        Assert.assertEquals(expSpeak, actualSpeak);

    }




}

