package homework.v1;

public class IndividualCustomer extends Customer{
    private String name ;
    private String identityNo ;

    public IndividualCustomer(int taxNo, String name, String identityNo) {
        super(taxNo);
        this.name = name;
        this.identityNo = identityNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }
}
