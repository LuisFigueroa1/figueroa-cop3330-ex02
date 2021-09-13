package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 02 Solution
 *  Copyright 2021 Luis Figueroa
 */
import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        String Name1; //declare the name of the string variable


        System.out.println( "What is the input string?" );
        Name1 = userInput.nextLine(); //scan the input
        int stringL = Name1.length(); //built-in function to get length

        //prints out string
        System.out.println( Name1 + " has " + stringL + " characters.");
    }
}

