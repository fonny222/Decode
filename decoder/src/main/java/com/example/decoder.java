package com.example;

import java.util.Scanner;

public class decoder {

    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);

// set the variables
        String codeIn;
        String optionOne = "Lovely";
        String optionTwo = "Cloudy";
        String optionThree = "Dreary";
// unicode characters set to variables
        char oppExclaim = '\u00A1';
        char exclaim = '\u0021';

        // type in the code response to find out what it means
        System.out.println("Please code in: ");
        System.out.println();
        System.out.println("How was the weather Today?");
        System.out.println("Lovely");
        System.out.println("Cloudy");
        System.out.println("Dreary");
        System.out.println();
        System.out.println("What is your Response: ");
        codeIn = inputDevice.next();

        // while loop to make sure the proper response was typed
        while(codeIn.equalsIgnoreCase(optionOne) == false && codeIn.equalsIgnoreCase(optionTwo) == false && codeIn.equalsIgnoreCase(optionThree) == false)
        {
           System.out.println("Please enter one of the Following!: ");

            System.out.println("Lovely");
            System.out.println("Cloudy");
            System.out.println("Dreary");
            System.out.println();
            System.out.println("What is your Response: ");
            codeIn = inputDevice.next();
        }

        System.out.println();
        System.out.println();

        // if proper response is typed this compares the typed response
        // using if statements to decode it to the correct statement

        if(codeIn.equalsIgnoreCase(optionOne))
        {
            System.out.println(oppExclaim+"Attack is Imminent"+exclaim);
        }else if(codeIn.equalsIgnoreCase(optionTwo))
        {
            System.out.println(oppExclaim+"Attack is Possible"+exclaim);
        }else if(codeIn.equalsIgnoreCase(optionThree))
        {
            System.out.println(oppExclaim+"Attack is Unlikely"+exclaim);
        }






    }
}
