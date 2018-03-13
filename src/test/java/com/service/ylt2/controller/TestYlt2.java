package com.service.ylt2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestYlt2 {

        Ylt2Delegate ylt2Delegate = new Ylt2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = ylt2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}