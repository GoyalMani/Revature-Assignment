package com.company.week3.day1.EXercise;

import java.util.HashSet;
import java.util.Scanner;

public class ProgramHashset {
    public static void main(String[] args) {
       /* 1. Write a Java program to append the specified element to the end of a hash set.
        2. Write a Java program to iterate through all elements in a hash list.
        3. Write a Java program to get the number of elements in a hash set.
        4. Write a Java program to empty an hash set.*/

        System.out.println("Q1:Write a Java Program to append the specified element to the end of a hash set");
        HashSet<String>H =new HashSet<>();
        H.add("id-001");
        H.add("id-002");
        H.add("id-003");
        H.add("id-004");
        H.add("id-005");
        System.out.println("original HashSet"+H);
        System.out.println("Enter the element want to insert");
        Scanner ele=new Scanner(System.in);
        String element=ele.next();
        H.add(element);
        System.out.println("Hashset after appending the element"+H);
        System.out.println("***********");


        System.out.println("2. Write a Java program to iterate through all elements in a hash list.");
        System.out.println("Iterate through all element in a hash set");
        for(String s:H)
        {
            System.out.println(s);
        }

        System.out.println("***********");


        System.out.println("3. Write a Java program to get the number of elements in a hash set.");
        System.out.println("Hashset elements:   "+H);
        System.out.println( "number of elements in a HashSet:   "+H.size());
        System.out.println("***********");



        System.out.println("Q4. Write a Java program to empty an hash set");
        System.out.println("HasSet Contains:    "+H);
        System.out.println("Is HashSet Empty:  "+H.isEmpty());

        H.clear();
        System.out.println( "HashSet Contains After being Empty :    "+H);
        System.out.println("Is HashSet Empty:   "+H.isEmpty());
    }
}
