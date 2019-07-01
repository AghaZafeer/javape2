package com.stackroute.pe2;

public class StudentAnalytics {

    static String studentAnalysis(int input, int inputgrade[]) {
        for (int i = 0; i < inputgrade.length; i++)
        {
            if (inputgrade[i] < 0 || inputgrade[i] > 100)
                return "Invalid Grade";
        }
        int avg = calculateAverage(inputgrade);
        int max = calculateMaximum(inputgrade);
        int min = calculateMinimum(inputgrade);
        return "The Average is " + avg + "\n" + "The Maximum is " + max + "\n" + "The Minimum is " + min;
    }

    static int calculateAverage(int input[])
    {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        return sum / input.length;
    }

    static int calculateMaximum(int input[])
    {
        int max = input[0];
        for (int i = 1; i < input.length; i++)
        {
            if (input[i]>max)
            max = input[i];

        }


        return max;
    }
    static int calculateMinimum(int input[])
    {
        int min = input[0];
        for (int i = 1; i < input.length; i++)
        {
            if (input[i]<min)
            min = input[i];

        }
        return min;
    }
}
























































