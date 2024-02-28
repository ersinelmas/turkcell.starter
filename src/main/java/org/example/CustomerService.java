package org.example;

public class CustomerService implements ICustomerService{

    @Override
    public void add() {
        System.out.println("Customer service added");
    }

    @Override
    public void delete() {
        System.out.println("Customer service deleted");
    }

    @Override
    public void update() {
        System.out.println("Customer service updated");
    }
}
