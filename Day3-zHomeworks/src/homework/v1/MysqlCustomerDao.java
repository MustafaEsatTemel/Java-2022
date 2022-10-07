package homework.v1;

public class MysqlCustomerDao implements ICustomerDao{
    @Override
    public void add(Customer c) {
        System.out.println("Vergi numarasi mysql veri tabanina kaydedildi : "+c.getTaxNo());
    }
}
