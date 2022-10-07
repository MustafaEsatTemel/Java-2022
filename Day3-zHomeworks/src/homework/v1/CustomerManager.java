package homework.v1;

public class CustomerManager {

    private Customer customer;
    private ICustomerDao iCustomerDao;

    public CustomerManager(Customer customer, ICustomerDao iCustomerDao) {
        this.customer = customer;
        this.iCustomerDao = iCustomerDao;
    }

    public void add(){
        System.out.println(customer.getTaxNo()+" vergi numarasina sahip kullanici kaydedildi.");

        iCustomerDao.add(customer);

    }

}
