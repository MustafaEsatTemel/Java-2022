package me.mustafaesattemel.work2;

public class IndividualCustomer extends Customer{
    private String name;

    public IndividualCustomer(String address, String phoneNumber, int registrationYear, String email, String name) {
        super(address, phoneNumber, registrationYear, email);
        this.name = name;
    }

    public IndividualCustomer() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
