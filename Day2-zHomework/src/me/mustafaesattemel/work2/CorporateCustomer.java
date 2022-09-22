package me.mustafaesattemel.work2;

public class CorporateCustomer extends Customer{
    private String companyName;

    public CorporateCustomer(String address, String phoneNumber, int registrationYear, String email, String companyName) {
        super(address, phoneNumber, registrationYear, email);
        this.companyName = companyName;
    }

    public CorporateCustomer() {}

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
