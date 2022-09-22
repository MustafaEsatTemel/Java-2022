package me.mustafaesattemel.work2;

public class IndividualManager extends CustomerManager{

    public void register(IndividualCustomer customer) {
        System.out.println("Kullanici kaydedildi, kaydedilen kullanici : "+customer.getName());
    }
}
