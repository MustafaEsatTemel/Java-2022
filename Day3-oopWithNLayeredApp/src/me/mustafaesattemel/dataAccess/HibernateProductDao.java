package me.mustafaesattemel.dataAccess;

import me.mustafaesattemel.entities.Product;

public class HibernateProductDao implements ProductDao{
    //Sadece ve sadece db erisim kodlari buraya yazilir. SQL.
    public void add(Product product){
        System.out.println("Added with using Hibernate");
    }
}
