package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial ob;
    @Before
    public void setUp() throws Exception {
        ob=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void test1()
    {
        String res=ob.intFactorial(5);
        assertEquals("120",res);

    }

    @Test
    public void test2()
    {
        String res=ob.intFactorial(13);
        assertEquals(null,res);

    }

    @Test
    public void test3()
    {
        String res=ob.longFactorial(50);
        assertEquals(null,res);

    }

    @Test
    public void test4()
    {
        String res=ob.longFactorial(18);
        assertEquals("6402373705728000",res);

    }



}