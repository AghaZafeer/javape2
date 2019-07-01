package com.stackroute.pe2;

public class PowerOfFour {

    static String powerOfFourChecker(float input)
    {

        while(input!=1)
        {
            input=input/4;
            if(input>=0 && input<4)
                break;
        }

        if(input==1)
        return "Given input is a power of four";

      return "Given input is not a power of four";

    }
}