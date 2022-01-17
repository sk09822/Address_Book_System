package com.bl.day22;

import java.util.*;

public class NewAddressBook {
    public List<Contact> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void operation() {
        System.out.println("Enter Number of contact you want to add");
        int count = scan.nextInt();
        int contactCount = 1;
        while (contactCount <= count) {

            this.add();
            contactCount++;
        }
        boolean status = true;
        do {

            System.out.println("Choose Operation you want to do");
            System.out.println("1. Add\t2.Edit\t3.Delete\t4.sortCity");
            switch (scan.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    sortCity();
                default:
                    status = false;
            }
        } while (status);
    }

    public void add() {
        Contact contacts = new Contact();
        System.out.println("Enter the First name:");
        String firstName = scan.next();
        contacts.setFirstName(firstName);

        System.out.println("Enter the Last name:");
        String lastName = scan.next();
        contacts.setLastName(lastName);

        System.out.println("Enter the address:");
        String address = scan.next();
        contacts. setAddressCity(address);



        System.out.println("Enter the State:");
        String state = scan.next();
        contacts.setState(state);

        System.out.println("Enter the Zip:");
        Long zip = scan.nextLong();
        contacts.setZip(zip);

        System.out.println("Enter the Phone Number:");
        Long phoneNumber = scan.nextLong();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter the Email");
        String email = scan.next();
        contacts.setEmail(email);
        this.list.add(contacts);
        print();
    }

    public void edit() {
        System.out.println("Enter your First name:");
        String firstName = scan.next();

        Iterator<Contact> iterator = this.list.listIterator();

        while (iterator.hasNext()) {
            Contact contacts = iterator.next();

            if (firstName.equals(contacts.getFirstName())) {
                System.out.println("Choose field you want to add:");
                System.out.println("1.Last Name\t2.Address\t3.City\t4.State\t5. Zip\t6.Phone Number\t7.Email");
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your Last Name");
                        contacts.setLastName(scan.next());
                        break;
                    case 2:
                        System.out.println("Re-Correct your Address");
                        contacts.setAddressCity(scan.next());
                        break;

                    case 3:
                        System.out.println("Re-Correct your State");
                        contacts.setState(scan.next());
                        break;
                    case 4:
                        System.out.println("Re-Correct your Zip");
                        contacts.setZip(scan.nextLong());
                        break;
                    case 5:
                        System.out.println("Re-Correct your Phone Number");
                        contacts.setPhoneNumber(scan.nextLong());
                    case 6:
                        System.out.println("Re-Correct your Email");
                        contacts.setEmail(scan.next());
                }

            }
        }
    }

    public void delete() {
        System.out.println("Enter your First name:");
        String firstName = scan.next();

        Iterator<Contact> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Contact contacts = iterator.next();

            if (firstName.equals(contacts.getFirstName())) {
                list.remove(contacts);
            }
        }
    }

    public void print() {
        Iterator<Contact> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void sortCity() {
        Collections.sort(list, Sort.compareCity);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "list=" + list +
                '}';
    }
}