package org.example;

/**
 * interface Phone
 * // Contacts()
 * // textMessages()
 * // CallHistory()
 * // sendMessage()
 * // call()
 */

public class App {
    public static void main(String[] args) {

        //Phone phone= new Samsung(); // shouldn't compile

        Phone phone = new SamsungGalaxyS6();

        phone.addContact("1", "phone number", "first name", "last name");

        phone.addContact("2", "second phone number", "second first name", "second last name");

        phone.getFirstContact();

        phone.getLastContact();
        //phone.seeContacts();

// send a message to the first contact from the previously listed

// max number of characters - 100

        phone.sendMessage("phone number", "message content");

        phone.sendMessage("phone number", "message content2");

        phone.getFirstMessage("phone number");

        phone.getSecondMessage("phone number");
//
//// make a call to the second contact from the previously listed
//
        phone.call("second phone number");


        phone.viewHistory();


    }
}
