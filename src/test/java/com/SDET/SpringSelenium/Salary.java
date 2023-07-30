package com.SDET.SpringSelenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    @Value("${am:100}")
    private int amount;

    public Salary() {
        this.amount = 110000;
    }

    public int getAmount() {
        return amount;
    }
}
