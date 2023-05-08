package org.example;

public class Countries {

    String nameOfCountries;

    public Countries(String nameOfCountries) {
        this.nameOfCountries = nameOfCountries;
    }

    public String getNameOfCountries() {
        return nameOfCountries;
    }

    @Override
    public String toString() {
        return "Countries " +
                "name='" + nameOfCountries + '\'';
    }
}
