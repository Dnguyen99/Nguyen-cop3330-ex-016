/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scan.nextInt();

        if(age >= 16 ) {
            System.out.println("You are old enough to legally drive.");
        }
        else {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
