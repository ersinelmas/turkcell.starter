package org.example;

public class CustomerManager implements ICustomerService{
    @Override
    public void add() {
        System.out.println("Customer manager added");
    }

    @Override
    public void delete() {
        System.out.println("Customer manager deleted");
    }

    @Override
    public void update() {
        System.out.println("Customer manager updated");
    }
}
