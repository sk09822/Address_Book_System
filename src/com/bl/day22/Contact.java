package com.bl.day22;

public class Contact {
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private String email;
    private Long zip;
    private Long phoneNumber;

    public Contact(String firstName, String lastName, String addressCity, String state, String email, Long zip, Long phoneNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCity = addressCity;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String firstName, String lastName, String address, String state, String zipcode, String phoneNumber, String email, String cityForMap) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


}