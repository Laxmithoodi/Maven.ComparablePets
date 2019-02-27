package io.zipcoder;


import java.io.IOException;
import java.util.*;

public class Application {

    public static void main(String[] args) throws IOException {
        IOConsole ui = new IOConsole();
        ui.startInterface();
        // ui.consoleInput();


//            // public static void main(String[] args) {
//
//            public static void println(String message) {
//                io.zipcoder.IOConsole.println(message);
//            }


        //   public void consoleInput() {

        Scanner input = new Scanner(System.in);

        List<Pets> pet = new ArrayList<>();

        //       System.out("How many Pets do you have?");

        // IOConsole.("How many Pets do you have?");

        int k = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= k; i++) {

            IOConsole.println("Enter Pet Type");
            IOConsole.println("Enter Pet Name");

            String petType = input.nextLine();
            String petName = input.nextLine();
            if (petType.equalsIgnoreCase("dog")) {
                Dog dog = new Dog(petName);
                dog.setName(petName);
                pet.add(dog);
                IOConsole.println(dog.getName() + " - " + dog.speak());

            }

            if (petType.equalsIgnoreCase("cat")) {
                Cat cat = new Cat(petName);
                cat.setName(petName);
                pet.add(cat);
                IOConsole.println(cat.getName() + " - " + cat.speak());
            }


            if (petType.equalsIgnoreCase("Pony")) {
                Pony pony = new Pony(petName);
                pony.setName(petName);
                pet.add(pony);

                IOConsole.println(pony.getName() + " - " + pony.speak());
            }

        }
        //for (Pets p : pet) {
        // IOConsole.println("Pet List :" + Arrays.toString(new List[]{pet}));
        //IOConsole.println("Pet List :" + pet);
        for (Pets p : pet) {
            IOConsole.println("Pet Name :" + p.getName() + " Pet Speaks like : " + p.speak());

        }
    }




}






