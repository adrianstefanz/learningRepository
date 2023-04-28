package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Samsung implements Phone {
    protected double batteryLife;
    protected String color;
    protected String material;
    protected String imei;

    //protected String textMessage;


    // Contacts contacts = new Contacts();

    List<Contacts> contactsList = new ArrayList<Contacts>();
    List<String> messagesToFirstContact = new ArrayList<String>();
    List <String> callHistory = new ArrayList<String>();


    public Samsung(double batteryLife, String color, String material, String imei) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    public Samsung() {

    }

    @Override
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {

        Contacts contact = new Contacts();

        contact.setId(id);
        contact.setPhoneNumber(phoneNumber);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);

        contactsList.add(contact);


    }

    public void getFirstContact(/*String id, String phoneNumber, String firstName, String lastName*/) {
        Contacts firstContact = contactsList.get(0);


    }

    public void getLastContact() {
        Contacts lastContact = contactsList.get(contactsList.size() - 1);
    }

    @Override
    public void seeContacts() {
        for (int i = 0; i < contactsList.size(); i++) {
//            System.out.println(contactsList.get(i).id);
//            System.out.println(contactsList.get(i).phoneNumber);
//            System.out.println(contactsList.get(i).firstName);
//            System.out.println(contactsList.get(i).lastName);

        }


    }

    @Override
    public void sendMessage(String phoneNumber, String textMessage) {


        if (textMessage.length() < 100) {
            messagesToFirstContact.add(textMessage);
            //System.out.println(textMessage);

        } else
            System.out.println("Text message to big");
    }

    @Override
    public void getFirstMessage(String phoneNumber) {
        String firstMessage = messagesToFirstContact.get(0);
        System.out.println(firstMessage);

    }

    @Override
    public void getSecondMessage(String phoneNumber) {
        String secondMessage = messagesToFirstContact.get(1);
        System.out.println(secondMessage);

    }


    @Override
    public void call(String secondPhoneNumber) {
        callHistory.add(secondPhoneNumber);
        System.out.println("Calling " + contactsList.get(1).phoneNumber);

    }

    @Override
    public void viewHistory() {
        for (int i = 0; i <callHistory.size(); i++){
            System.out.println("Calling history: " + callHistory.get(i));
        }
    }


}

