package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class NameComparatorTest {

    @Test
    public void test1() {

        Comparator<Pets> nameComparator = (Comparator<Pets>)new NameComparator();

        Pets item1 = new Pets("cccc");
        Pets item2 = new Pets("dash");
       // Pets item3 = new Pets("ppppp");

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }
    }
