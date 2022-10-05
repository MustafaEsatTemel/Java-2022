package me.mustafaesattemel;

import me.mustafaesattemel.business.ProductManager;
import me.mustafaesattemel.core.logging.DatabaseLogger;
import me.mustafaesattemel.core.logging.FileLogger;
import me.mustafaesattemel.core.logging.Logger;
import me.mustafaesattemel.dataAccess.JdbcProductDao;
import me.mustafaesattemel.entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {

        Product p1 = new Product(1,"Iphone 12",10.500);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger()};

        ProductManager pm = new ProductManager(new JdbcProductDao(),loggers);
        pm.add(p1);

    }
}
