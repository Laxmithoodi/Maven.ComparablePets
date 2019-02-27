package io.zipcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PetSorter {

    Pets[] pets;

    public PetSorter(Pets[] pets) {
        this.pets = pets;
    }

    public Pets[] sort(Comparator<Pets> comparator){

        Collections.sort(Arrays.asList(this.pets), comparator);
        return pets;
    }
}
