package com.practise4;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Personal_loan {
    @Test
    public void WebLoginPersonalLoan() {
        System.out.println("WebLoginPersonalLoan");
    }

  @Test
  public void ApiLoginPersonalLoan(){
      System.out.println("ApiLoginPersonalLoan");
  }
  @BeforeSuite
  public void FirstExecute(){
      System.out.println("first one");
  }
    @Test(groups = {"SmokeTest"})
    public void MobileLoginPersonalLoan(){
        System.out.println("MobileLoginPersonalLoan");
    }

}
