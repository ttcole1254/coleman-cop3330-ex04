package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner askNoun = new Scanner(System.in);
        System.out.println("Enter a noun: ");

        String inputNoun = askNoun.nextLine();
        if(inputNoun.isEmpty()) {
            System.out.println("A noun is required!");
        }
        else {
            Scanner askVerb = new Scanner(System.in);
            System.out.println("Enter a verb: ");
            String inputVerb = askVerb.nextLine();
            if(inputVerb.isEmpty()) {
                System.out.println("A verb is required!");
            }
            else {
                Scanner askAdjective = new Scanner(System.in);
                System.out.println("Enter an adjective: ");
                String inputAdjective = askAdjective.nextLine();
                if(inputAdjective.isEmpty()) {
                    System.out.println("An adjective is required!");
                }
                else {
                    Scanner askAdverb = new Scanner(System.in);
                    System.out.println("Enter an adverb: ");
                    String inputAdverb = askAdverb.nextLine();
                    if(inputAdverb.isEmpty()) {
                        System.out.println("An adverb is required!");
                    }
                    else {
                        System.out.printf("Do you %s your %s %s %s? That's hilarious!", inputVerb, inputAdjective, inputNoun, inputAdverb);
                    }
                }
            }
        }
    }
}
