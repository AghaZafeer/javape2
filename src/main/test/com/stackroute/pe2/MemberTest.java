package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    Member ob,ob1;
    @Before
    public void setUp() throws Exception {
        ob=new Member("Anshuman",21,25000);
        ob1=new Member("Agha Zafeer",21,20000);
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void test1()
    {
        String res=ob.display();
        assertEquals("Member's name: Anshuman"+"\n"+"age: 21"+"\n"+"salary: 25000.0", res);
    }


    @Test
    public void test2()
    {
        String res=ob1.display();
        assertEquals("Member's name: Agha Zafeer"+"\n"+"age: 21"+"\n"+"salary: 20000.0", res);
    }
}
