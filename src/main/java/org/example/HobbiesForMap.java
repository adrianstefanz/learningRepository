package org.example;

public class HobbiesForMap {

    public String hobbiesNameForMap;

    public HobbiesForMap(String nameOfHobbiesForMap) {
        this.hobbiesNameForMap = nameOfHobbiesForMap;
    }

    public String getHobbiesNameForMap() {
        return hobbiesNameForMap;
    }

    @Override
    public String toString() {
        return "Hobbies " +
                "name='" + hobbiesNameForMap + '\'';
    }
}
