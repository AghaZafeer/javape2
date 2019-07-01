package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentAnalyticsTest {
    StudentAnalytics ob;
    @Before
    public void setUp() throws Exception {

        ob=new StudentAnalytics();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void test1()
    {   int grade[]=new int[]{40,-90,50};
        String res=ob.studentAnalysis(3,grade);
        assertEquals("Invalid Grade" ,res);
    }

    @Test
    public void test2()
    {   int grade[]=new int[]{40,90,50};
        String res=ob.studentAnalysis(3,grade);
        assertEquals("The Average is 60\nThe Maximum is 90\nThe Minimum is 40" ,res);
    }





}