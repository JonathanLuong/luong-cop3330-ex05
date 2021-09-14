package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.println( "What is the first number?" );
        String firstNum = reader.nextLine();

        System.out.println( "What is the second number?" );
        String secondNum = reader.nextLine();

        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2) + "\n" + num1 + " - " + num2 + " = " + (num1-num2) + "\n" + num1 + " * " + num2 + " = " + (num1*num2) + "\n" + num1 + " / " + num2 + " = " + (num1/num2));
    }
}