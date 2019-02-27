package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class PetSorterTest {

    @Test
    public void sort() {
    }


    @Test
    public void testPetNameSort() {
        // given
        Pets item3 = new Pets("Dash");
        Pets item2 = new Pets("Moucy");
        Pets item1 = new Pets("Pamper");
        Pets[] itemsToSort = {item2, item1, item3};
        Pets[] expected = {item3, item2, item1};
        PetSorter itemSorter = new PetSorter(itemsToSort);
        Comparator<Pets> comparator = (Comparator<Pets>) new NameComparator();

        // when
        Pets[] actual = itemSorter.sort(comparator);


        // then
        Assert.assertArrayEquals(expected, actual);
        for (int i = 0; i < actual.length; i++) {

            System.out.println(actual[i].getName());
        }


    }



}