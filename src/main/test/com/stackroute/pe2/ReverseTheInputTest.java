package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTheInputTest {
    ReverseTheInput ob;
    @org.junit.Before
    public void setUp() throws Exception {
        ob=new ReverseTheInput();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        ob=null;
    }


    @Test
    public void test1()
    {
        boolean res=ob.reversedInput("121");
        assertEquals(true,res);



    }

    @Test
    public void test2()
    {
        boolean res=ob.reversedInput("12");
        assertEquals(false,res);



    }

    @Test
    public void test3()
    {
        boolean res=ob.reversedInput("12321");
        assertEquals(true,res);



    }






}