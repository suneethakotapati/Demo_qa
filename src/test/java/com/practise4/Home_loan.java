package com.practise4;

import org.testng.annotations.Test;

public class Home_loan {
    @Test
    public void WebLoginHomeLoan(){
        System.out.println("WebLoginHomeLoan");
    }
    @Test(groups = {"SmokeTest"})
    public void ApiLoginHomeLoan(){
        System.out.println("ApiLoginHomeLoan");
    }
    @Test
    public void MobileLoginHomeLoan(){
        System.out.println("MobileLoginHomeLoan");
    }
}
