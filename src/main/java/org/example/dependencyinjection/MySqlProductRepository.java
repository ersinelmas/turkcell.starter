package org.example.dependencyinjection;

public class MySqlProductRepository implements ProductRepository{
    @Override
    public void addToDatabase() {
        System.out.println("Product is being added to MySql database...");
    }
}
