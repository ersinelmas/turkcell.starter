package org.example.dependencyinjection;

import org.example.logging.BaseLogger;
import org.example.logging.Logger;

public class ProductServiceImpl implements ProductService{
    // Product adding process's validation and business logic can be implemented before here
    // Repository or DAO layer can be called here to save the product
    // ctor

    ProductRepository productRepository;
    BaseLogger logger;
    public ProductServiceImpl(ProductRepository productRepository, BaseLogger logger) {
        System.out.println("ProductServiceImpl is being created...");
        this.productRepository = productRepository;
        this.logger = logger;
    }


    @Override
    public void add() {
        System.out.println("Service processes are done, repository processes are starting...");
        productRepository.addToDatabase();
        logger.logMesssage("Add operation is logged");
    }

    @Override
    public void update() {
        System.out.println("Service processes are done, repository processes are starting...");
        productRepository.addToDatabase();
        logger.logMesssage("Add operation is logged");
    }

}
