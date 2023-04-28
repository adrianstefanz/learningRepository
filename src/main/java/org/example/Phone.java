package org.example;

public interface Phone {
    void addContact(String id, String phoneNumber, String firstName, String lastName);


    void getFirstContact();

    void seeContacts();

    void sendMessage(String phoneNumber, String textMessage);

    //void seeMessagesForSpecificContact();


    void call(String phoneNumber);

    void viewHistory();


    void getLastContact();

    void getFirstMessage(String phoneNumber);

    void getSecondMessage(String phoneNumber);
}
