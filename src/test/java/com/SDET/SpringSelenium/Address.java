package com.SDET.SpringSelenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*
Class level injection spring
@Component :- regular class managed by
if @Componenet not used on class,then spring will throw bean not found error
that means,spring not managing class and developer has to create objects on main class to call method
 */
@Component
public class Address {
    @Value("${address}")
    private String addressline;

    public Address() {
        this.addressline = "123 strrect , cross jn";
    }
    public String getAddressline() {
        return addressline;
    }
}
