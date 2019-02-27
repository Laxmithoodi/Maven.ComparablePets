package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;

public class NameComparator implements Comparator<Pets> {

    public int compare(Pets o1, Pets o2) {
        int name = o1.getName().compareTo(o2.getName());
        return name;
    }


}
