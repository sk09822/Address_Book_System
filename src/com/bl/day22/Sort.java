package com.bl.day22;

import java.util.Comparator;

public class Sort {
    static Comparator<Contact> compareCity = new Comparator<Contact>() {
        @Override
        public int compare(Contact one, Contact two) {
            return one.setAddressCity().compareTo(two.setAddressCity());
        }


    };
    static Comparator<Contact> compareState = new Comparator<Contact>() {

        @Override
        public int compare(Contact one, Contact two) {
            return one.getState().compareTo(two.getState());
        }
    };

}