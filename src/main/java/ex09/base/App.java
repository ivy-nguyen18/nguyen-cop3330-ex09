/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex09.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length?");
        float length = input.nextFloat();

        System.out.println("What is the width?");
        float width = input.nextFloat();

        CalculateGallons paint = new CalculateGallons(length, width);

        paint.gallonsForCeiling();

    }
}
