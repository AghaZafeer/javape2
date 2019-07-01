package com.stackroute.pe2;

public class Factorial {

        static String intFactorial(int input)
        {
            if(input>12)
                return null;

            int fact=1;
            for(int i=2;i<=input;i++)
            {
                fact*=i;
            }

            return Integer.toString(fact);
        }

    static String longFactorial(long input)
    {
        if(input>20)
            return null;

        long fact=1;
        for(int i=2;i<=input;i++)
        {
            fact*=i;
        }

        return Long.toString(fact);
    }


}
