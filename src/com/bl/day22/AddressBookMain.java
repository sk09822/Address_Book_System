package com.bl.day22;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        Map<String, NewAddressBook> map = new HashMap<>();
        System.out.println("Enter Number of address book you want to add");
        Integer count = scan.nextInt();
        Integer i = 0;
        while (i < count) {
            System.out.println("Enter  book name");
            String bookName = scan.next();
            NewAddressBook addressBook = new  NewAddressBook();
            addressBook.operation();
            map.put(bookName, addressBook);
            i++;
        }
        System.out.println(map);


    }

}