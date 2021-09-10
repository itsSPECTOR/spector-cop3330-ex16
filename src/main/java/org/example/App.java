package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 16 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App
{
    public static void main( String[] args )
    {

        // scanner
        Scanner input = new Scanner(System.in);

        // get age
        System.out.print("What is your age? ");
        String strAge = input.nextLine();

        //convert string
        int userAge = Integer.parseInt(strAge);

        //ternary operator
        final String tempMsg = userAge >= 16 ? " " : " not ";

        //print summary
        System.out.print("You are" + tempMsg +"old enough to legally drive.\n");

    }
}
