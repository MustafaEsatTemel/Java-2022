package me.mustafaesattemel.work2;

public class CorporateManager extends CustomerManager{
    public void register(CorporateCustomer customer) {
        System.out.println("Sirket kaydedildi, kaydedilen sirket : "+customer.getCompanyName());
    }
}
