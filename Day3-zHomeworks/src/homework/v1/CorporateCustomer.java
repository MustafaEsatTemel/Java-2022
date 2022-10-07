package homework.v1;

public class CorporateCustomer extends Customer{
    private String companyName;

    public CorporateCustomer(int taxNo, String companyName) {
        super(taxNo);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
