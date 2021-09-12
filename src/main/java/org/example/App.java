/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int length, width;
        double gallons, conversion = 350.0;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the ceiling? ");
        length = input.nextInt();

        System.out.print("What is the width of the ceiling? ");
        width = input.nextInt();

        gallons = Math.ceil((length * width) / conversion);

        System.out.print("You will need to purchase " + (int)Math.round(gallons) + " gallons of paint to cover " + (length * width) + " square feet.");
    }
}