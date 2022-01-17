package com.bl.day22;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAddressBook {
    Scanner sc = new Scanner(System.in);
    Contact person = new Contact();

    ArrayList<Contact> contactList = new ArrayList<>();

    public Contact addContact() {
        System.out.println("Enter the details of the contact");
        {
            System.out.println("Enter First Name: ");
            String firstName = sc.nextLine();
            System.out.println("Enter last Name: ");
            String lastName = sc.nextLine();
            System.out.println("Enter your addressCity: ");
            String addressCity = sc.nextLine();
            System.out.println("Enter your state: ");
            String state = sc.nextLine();
            System.out.println("Enter your EMail ID: ");
            String email = sc.nextLine();
            System.out.println("Enter zip code : ");
            long zip = sc.nextLong();
            System.out.println("Enter phone number: ");
            long phoneNumber = sc.nextLong();
            contactList.add(new Contact());
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAddressCity(addressCity);
            person.setState(state);
            person.setEmail(email);
            person.setPhoneNumber(phoneNumber);
            person.setZip((int) zip);
            System.out.println("The Details Of Contact Is : " + person);
            return person;
        }
    }

    public void editContact() {
        System.out.println(" Enter the first name of the contact : ");
        String contactFirstName = sc.nextLine();
        if (contactList.isEmpty()) {
            System.out.println(" Contact List is Empty! ");
        } else {
            for (Contact person : contactList) {
                String checkName = person.getFirstName();
                if (checkName.equalsIgnoreCase(contactFirstName)) {
                    System.out.print("Enter New First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter New AddressCity: ");
                    String address = sc.nextLine();
                    System.out.print("Enter New State: ");
                    String state = sc.nextLine();
                    System.out.print("Enter New Email Id: ");
                    String email = sc.nextLine();
                    System.out.print("Enter New Zip Code of area: ");
                    long zip = sc.nextLong();
                    System.out.print("Enter New Mobile Number: ");
                    long phoneNumber = sc.nextLong();

                    person.setFirstName(firstName);
                    person.setLastName(lastName);
                    person.setAddressCity(address);
                    person.setState(state);
                    person.setEmail(email);
                    person.setZip((int) zip);
                    person.setPhoneNumber(phoneNumber);
                    System.out.println("Contact List Updated! ");
                } else {
                    System.out.println(" Name not found. Enter Valid Name");
                }
            }
        }
    }

    public void deleteContact() {
        System.out.println("Enter the name of the contact to be deleted : ");
        String deleteName = sc.next();
        if (contactList.isEmpty()) {
            System.out.println("The AddressBook is Empty....!");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String matcher = contactList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(deleteName)) {
                    contactList.remove(i);
                    System.out.println("Contact Deleted Successfully...");
                } else {
                    System.out.println("Name Not Found");
                }
            }
        }
    }

    public void showContact() {
        System.out.println("Total Number of Contacts : " + contactList.size());
        System.out.println("---------------------------------------------------");
        if (contactList.isEmpty()) {
            System.out.println("There are no contacts in the contact list");
        } else {
            System.out.println(contactList);
            System.out.println("\n---------------------------------------------");
        }
    }

    public void getMenu() {
        boolean exit = false;
        do {
            System.out.println("Choose the valid option \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    System.out.println(person);
                    System.out.println("Contact added successfully....");
                    break;
                case 2:
                    editContact();
                    System.out.println(person);
                    System.out.println("Contact details updated successfully");
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.print("Enter the valid option!");
                    break;
            }
        } while (!exit);
    }
}