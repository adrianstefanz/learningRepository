package org.example;

import java.util.Comparator;

public class SecondComparator implements Comparator<Person> {

    public int compare(Person e1, Person e2) {

        return (e1.age).compareTo(e2.age);
    }
}
