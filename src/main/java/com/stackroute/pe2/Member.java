package com.stackroute.pe2;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Member
{

    String name;
    int age;
    float salary;
     Member(String name,int age,float sal)
    {
        this.name=name;
        this.age=age;
        this.salary=sal;
    }

    String display()
    {
        return "Member's name: "+name+"\n"+"age: "+age+"\n"+"salary: "+salary;
    }

}
 class MemberVariable
{

    Member ob=new Member("Anshuman",21,25000);


}
