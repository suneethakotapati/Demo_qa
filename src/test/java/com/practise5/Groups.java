package com.practise5;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups= {"include Group"})
    public void test_case1()
    {
        System.out.println("This is test case 1");
    }
    @Test(groups= {"exclude Group"})
    public void test_case2()
    {
        System.out.println("This is test case 2");
    }
    @Test(groups= {"exclude Group"})

    public void test_case3()
    {
        System.out.println("This is test case 3");
    }
}


