package me.mustafaesattemel.work2;

public class Customer {
    private String address;
    private String phoneNumber;
    private int registrationYear;
    private String email;

    public Customer(String address, String phoneNumber, int registrationYear, String email) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.registrationYear = registrationYear;
        this.email = email;
    }
    public Customer(){}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
