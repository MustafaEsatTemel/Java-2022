package homework.v1;

public class Customer {
    private int taxNo;

    public Customer(int taxNo) {
        this.taxNo = taxNo;
    }

    public int getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(int taxNo) {
        this.taxNo = taxNo;
    }
}
