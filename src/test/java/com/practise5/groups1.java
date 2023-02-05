package com.practise5;

import org.testng.annotations.Test;

public class groups1 {
    @Test(groups={"include suni"})
    public void test1(){

        System.out.println("hi");
    }
    @Test(groups = {"include subbu"})
    public void test2(){
        System.out.println("hello");

    }
    @Test(groups = {"exclude madhu"})
    public void test3(){
        System.out.println("gd mrng");
    }
}
