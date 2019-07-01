package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest ob;
    @Before
    public void setUp() throws Exception {
        ob=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void test1()
    {
        boolean res=ob.isEven(2);
        assertEquals(true,res);

    }
    @Test
    public void test2()
    {
        boolean res=ob.isEven(21);
        assertEquals(false,res);

    }

    @Test
    public void test3()
    {
        boolean res=ob.isEven(44);
        assertEquals(true,res);

    }





}