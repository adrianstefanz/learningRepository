package org.example;

import java.util.*;
import java.util.HashMap;
import java.util.TreeSet;

/**

 // store Person in a TreeSet
 // define 2 Comparators (one for name and one for age) that will be used when creating the TreeSet
 // add Person to the TreeSet
 // iterate through the TreeSet and print the name and the age
 // list of his/her hobbies for 1 person
 // Class Hobby
  - name of the hobby (String) – ex: cycling, swimming
  - frequency (int) – how many times a week they practice it
  - list of addresses where this hobby can be practiced (List<Address>)
 // use a HashMap with the following structure <Person, List<Hobby>>
 // add some information to this map - any detail you consider relevant
 // or a certain Person, print the names of the hobbies and the countries where it can be practiced

 */

public class App {
    public static void main(String[] args) {
        TreeSet<Person> peopleSet = new TreeSet<>(new FirstComparator());


        Person adrian = new Person("Adrian", 28);
        Person ionut = new Person("Ionut", 14);
        Person darius = new Person("Darius", 35);

        peopleSet.add(adrian);
        peopleSet.add(ionut);
        peopleSet.add(darius);


        System.out.println(peopleSet);

        adrian.addHobby("football");
        adrian.addHobby("gaming");
        adrian.addHobby("watching TV shows");


        List<String> hobbiesOfAdrian = (List<String>) adrian.getPeopleHobbies();

        System.out.println("Adrian's hobbies are " + hobbiesOfAdrian);


        List<Address> addresses = new ArrayList<Address>();

        addresses.add(new Address("First Street", "Bucharest", 18));
        addresses.add(new Address("Second Street", "Budapest", 2));

        PersonHobby football = new PersonHobby("football", 3, addresses);

        System.out.print("Hobby " + hobbiesOfAdrian.get(0));
        System.out.print(" has the frequency of " + football.getFrequency());
        System.out.print(" and it can be practiced at: " + football.getAddresses());


        Map<Person, List<HobbiesForMap>> map = new HashMap<>();

        Person Daniel = new Person("Daniel", 26);
        Person Alexandru = new Person("Alexandru", 37);


        List<HobbiesForMap> hobbiesOfDaniel = new ArrayList<>();

        hobbiesOfDaniel.add(new HobbiesForMap("swimming"));
        hobbiesOfDaniel.add(new HobbiesForMap("walking"));

        map.put(Daniel, hobbiesOfDaniel);

        List<HobbiesForMap> hobbiesOfAlexandru = new ArrayList<>();

        hobbiesOfAlexandru.add(new HobbiesForMap("cycling"));
        hobbiesOfAlexandru.add(new HobbiesForMap("running"));

        map.put(Alexandru, hobbiesOfAlexandru);

        map.put(Daniel, hobbiesOfDaniel);

        List<Countries> countries = new ArrayList<>();


        countries.add(new Countries("Norway"));
        countries.add(new Countries("Romania"));
        countries.add(new Countries("Spain"));


        System.out.println(map);
        System.out.println("DANIEL = " + (map.get(Daniel)) + "can be practiced in the countries" + countries);
        System.out.println("ALEXANDRU = " + map.get(Alexandru) + "can be practiced in the countries" + countries);

    }
}


