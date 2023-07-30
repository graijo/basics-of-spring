package com.SDET.SpringSelenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    /* FIELD INJECTION
 Assigning Address variable in setter method with instance variable of address using
 Autowired.
 then we can avoid setter and constructors
 if not used then cause null pointer exception in fields whereever used
  */
    @Autowired
    private Address address;
    @Autowired
    private Salary salary;



    /*
        Constructor of user used to set values for address and salary
         */
//    public User(Address address, Salary salary) {
//        this.address = address;
//        this.salary = salary;
//    }

    /* CONSTRUCTOR INJECTION
    we can set values using setter methods instead of constructor
    but this will give null pointer exception
    to overcome it ,spring provides @autowired option
    */

//    @Autowired
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//   @Autowired
//    public void setSalary(Salary salary) {
//        this.salary = salary;
//    }
    public void printDetails(){

//        System.out.println("Address ="+this.address.getAddressline());
//        System.out.println("Salary ="+this.salary.getAmount());
/*
No need of this as we started using @Autowired for instance variable
 */
        System.out.println("Address ="+address.getAddressline());
        System.out.println("Salary ="+salary.getAmount());
    }

}
