package org.example;

import java.util.Comparator;

class FirstComparator implements Comparator<Person> {

    @Override
    public int compare(Person e1, Person e2) {
        return (e1.name).compareTo(e2.name);
    }
}

