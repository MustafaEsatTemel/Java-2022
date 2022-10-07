package homework.v1;

public class Main {
    public static void main(String[] args) {

        Customer c = new IndividualCustomer(123,"Mustafa Esat","405737");
        CustomerManager cm = new CustomerManager(c,new MysqlCustomerDao());
        cm.add();

    }
}
