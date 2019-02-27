package io.zipcoder;

import java.util.Comparator;

//public abstract class Pets {
public  class Pets  {

    private String name;
  //  private String petType;


    public Pets(){

    }

    public Pets(String name) {

        this.name = name;
       // this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // public String getPetType(){return petType; }

//    public  void  setPetType(String petType){
//        this.petType = petType;}


    public  String speak(){
        return "blorp";
    }

//
//    @Override
//    public int compare(Pets o1, Pets o2) {
//        return 0;
//    }
}
