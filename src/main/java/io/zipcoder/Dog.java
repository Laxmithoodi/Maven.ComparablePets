package io.zipcoder;

import java.util.Collection;

public class Dog extends Pets {


    public Dog(String name) {

        super(name);
    }



//    public Dog() {
//
//    }


    @Override
    public String speak() {

        return "Bark!";
    }


}
