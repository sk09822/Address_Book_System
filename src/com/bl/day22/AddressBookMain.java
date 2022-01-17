package com.bl.day22;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program...!!!");
       Contact newContact = new Contact();
        newContact.setFirstName("Sandipan\n");
        newContact.setLastName("Kanade\n");
        newContact.setAddressCity("Shirdi\n");
        newContact.setState("Maharashtra\n");
        newContact.setEmail("sandipank@gmail.com");
        newContact.setZip(414501);
        newContact.setPhoneNumber( 9822726196L);
        System.out.println("The Contact is :\n" +newContact);

}
}

