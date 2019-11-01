package com.company.mianjing;

public class Customer {

    private CustomerType customerType;

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Customer(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int addNumber(int i){
        return i++;
    }

    public int addNumber(long i){
        return Integer.parseInt(String.valueOf(i*2));
    }

//    public String converString(String  s){
//        return "one parameter";
//    }
//
//    public int converString(String s){
//        return 1;
//    }
}
