package me.mustafaesattemel.work2;

public class Main {
    public static void main(String[] args) {
        Customer individual = new IndividualCustomer("Ev", "05050", 2002, "esattemel130@gmail.com"
                , "Esad");

        Customer corporate = new CorporateCustomer("Sirket", "000020202", 2001, "sirketizbiz@contact.us",
                "BildircinDernegi");

        CustomerManager cm = new CorporateManager();
        CustomerManager cm2 = new IndividualManager();

        ((CorporateManager) cm).register((CorporateCustomer) corporate);
        ((IndividualManager) cm2).register((IndividualCustomer) individual);
        cm.register(corporate); //Customer Manager Works.
        cm.anyMethod();
        cm2.anyMethod();


    }
}
