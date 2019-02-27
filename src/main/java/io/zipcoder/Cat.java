package io.zipcoder;

public class Cat extends Pets{


    public Cat(String name) {
        super(name);
    }

//
//    public Cat() {
//
//    }


    @Override
    public String speak() {

        return "Meow!";
    }

}
