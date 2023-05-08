package org.example;

import java.util.List;



    public class PersonHobby {
        private String name;
        private int frequency;
        private List<Address> addresses;

        public PersonHobby(String name, int frequency, List<Address> addresses) {
            this.name = name;
            this.frequency = frequency;
            this.addresses = addresses;
        }

        public String getName() {
            return name;
        }

        public int getFrequency() {
            return frequency;
        }

        public List<Address> getAddresses() {
            return addresses;
        }
    }
