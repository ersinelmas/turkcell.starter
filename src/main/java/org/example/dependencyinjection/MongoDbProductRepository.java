package org.example.dependencyinjection;

public class MongoDbProductRepository implements ProductRepository{ // This class is the repository layer
    @Override
    public void addToDatabase() {
        System.out.println("Product is being added to MongoDB database...");
    }
}
