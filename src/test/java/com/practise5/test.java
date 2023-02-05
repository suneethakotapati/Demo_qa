package com.practise5;

import org.testng.annotations.Test;

public class test {

    @Test(groups = {"include group"})
    public void test(){
        System.out.println("test");
    }
    @Test(groups = {"include group"})
    public void test1(){
        System.out.println("test1");
    }
    @Test(groups = {"exclude group"})
    public void test2(){
        System.out.println("test2");
    }
}
