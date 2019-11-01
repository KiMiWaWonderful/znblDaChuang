package com.company.mianjing;

public class EnumDemo {

    public static void main(String[] args) {
        System.out.println(CustomerType.INDIVIDUL);

        Customer c = new Customer(CustomerType.ORGANIZATION);
        System.out.println(c.getCustomerType());

        for(CustomerType customerType:CustomerType.values()){
            System.out.println(customerType);
        }

        switch (c.getCustomerType()){
            case INDIVIDUL:
                System.out.println("INDIVIDUL");
            case ORGANIZATION:
                System.out.println("ORGANIZATION");
        }

        System.out.println(c.addNumber(2));
        System.out.println(c.addNumber(2L));
    }
}
