package com.practise4;

import org.testng.annotations.Test;

public class Car_loan {
    @Test(groups = {"SmokeTest"})
    public void WebLoginCarLoan(){
        System.out.println("WebLoginCarLoan");
    }
    @Test
    public void ApiLoginCarLoan(){
        System.out.println("ApiLoginCarLoan");
    }
    @Test
    public void MobileLoginCarLoan(){
        System.out.println("MobileLoginCarLoan");
    }
}
