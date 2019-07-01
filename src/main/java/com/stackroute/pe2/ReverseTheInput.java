package com.stackroute.pe2;

public class ReverseTheInput {

    static boolean reversedInput(String input)
    {
        StringBuffer sb=new StringBuffer(input);
        sb.reverse();
        String reversedinput=sb.toString();
        if(input.equals(reversedinput))
            return true;
        return false;

    }


}
