/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brooke Fuller
 */

import java.util.Scanner;
import java.lang.*;
import java.time.*;
import static java.lang.System.*;

public class Exercise9 {
    public static void main(String[] args) {

        System.out.println("What is the length of the room? ");
        Scanner input = new Scanner(in);
        String lengthR = input.nextLine();

        System.out.println("What is the width of the room? ");
        Scanner input2 = new Scanner(in);
        String widthR = input2.nextLine();

        double x = Double.parseDouble(lengthR);
        double y = Double.parseDouble(widthR);
        double area = Math.round(x * y);
        double numCans = area/ 350;
        double cans = (Math.round(numCans));

        System.out.println("You will need " + cans + " gallons of paint to cover " + area + " square feet." );

    }
}

