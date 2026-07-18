package org.example;

public class Main {

    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepository();

        CustomerService service = new CustomerService(repository);

        service.displayCustomer();

    }
}