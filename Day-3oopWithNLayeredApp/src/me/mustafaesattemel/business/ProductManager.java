package me.mustafaesattemel.business;

import me.mustafaesattemel.core.logging.Logger;
import me.mustafaesattemel.dataAccess.JdbcProductDao;
import me.mustafaesattemel.dataAccess.ProductDao;
import me.mustafaesattemel.entities.Product;

import java.util.List;


public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers){
        this.productDao = productDao;
        this.loggers = loggers;
    }


    //is kurallari
    public void add(Product product) throws Exception {
        if(product.getUnitPrice()<10){
            throw new Exception("The product price muse be bigger than 10");
        }
        productDao.add(product);

        for(Logger logger : loggers){
            logger.log(product.getName());
        }

    }
}
