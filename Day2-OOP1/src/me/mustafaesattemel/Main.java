package me.mustafaesattemel;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        //set value
/*        product1.name = "Delonghi coffee machine";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "Ajanp.svg";*/
        //get value
        //System.out.println(product1.name);

        product1.setName("Delonghi coffee machine");
        product1.setDiscount(7);
        product1.setImageUrl("Ajanp.svg");
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);

        Product product2 = new Product();
        //set value
/*        product2.name = "Regular Show coffee machine";
        product2.unitPrice = 5500;
        product2.discount = 5;
        product2.unitsInStock = 2;
        product2.imageUrl = "regularshow.svg";*/
        product2.setName("Delonghi coffee machine");
        product2.setDiscount(7);
        product2.setImageUrl("Ajanp.svg");
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);


        Product product3 = new Product();
        //set value
/*        product3.name = "Tsubasa coffee machine";
        product3.unitPrice = 4500;
        product3.discount = 8;
        product3.unitsInStock = 1;
        product3.imageUrl = "tsubasavshyuga.svg";*/
        product3.setName("Delonghi coffee machine");
        product3.setDiscount(7);
        product3.setImageUrl("Ajanp.svg");
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);


        Product [] products = {product1,product2,product3};

        System.out.println("<ul>");
        for(Product product : products){
            System.out.println("<li>" +product.getName()+ "</li");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("050505");
        individualCustomer.setCustomerNumber("123987456321");
        individualCustomer.setFirstName("Mustafa fistik arabaya kistik");
        individualCustomer.setLastName("My surname is surname");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Bildircin dernegi");
        corporateCustomer.setPhone("557221");
        corporateCustomer.setTaxNumber("12312313");
        corporateCustomer.setCustomerNumber("21212");

        Customer customers[] = {individualCustomer,corporateCustomer};

    }
}
