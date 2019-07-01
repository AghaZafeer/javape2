package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour ob;
    @Before
    public void setUp() throws Exception {

    ob=new PowerOfFour();

    }

    @After
    public void tearDown() throws E4xception {

        ob=null;
    }


    @Test
    public void powerCheckerTest1()
    {
        String res=ob.powerOfFourChecker(64);
        assertEquals("Given input is a power of four",res);

    }

    @Test
    public void powerCheckerTest2()
    {
        String res=ob.powerOfFourChecker(192);
        assertEquals("Given input is not a power of four",res);

    }

    @Test
    public void powerCheckerTest3()
    {
        String res=ob.powerOfFourChecker(0);
        assertEquals("Given input is not a power of four",res);

    }

    @Test
    public void powerCheckerTest4()
    {
        String res=ob.powerOfFourChecker(3);
        assertEquals("Given input is not a power of four",res);

    }

    private class E4xception extends Exception {
    }
}