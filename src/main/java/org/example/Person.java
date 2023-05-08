package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person {
    public String name;
    public Integer age;
    public java.util.List<String> peopleHobbies;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.peopleHobbies = new ArrayList<String>();;
    }

    public Person(List<String> peopleHobbies) {
        this.peopleHobbies = peopleHobbies;
    }


    public java.util.List<String> getPeopleHobbies() {
        return this.peopleHobbies;
    }

    @Override
    public String toString() {
        return "Person " + "name='" + name + '\'' + ", age=" + age + ", hobbies=" + peopleHobbies + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Person person = (Person) o;

        if (!Objects.equals(name, person.name)) {
            return false;
        }
        return Objects.equals(age, person.age);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    public void addHobby(String hobby) {
        this.peopleHobbies.add(hobby);
    }
}
