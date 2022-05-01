package com.company.week3.day1.EXercise;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeset {
    public static void main(String[] args) {
        /*1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        2. Write a Java program to iterate through all elements in a tree set.
        3. Write a Java program to add all the elements of a specified tree set to another tree set.
        4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        5. Write a Java program to get the first and last elements in a tree set*/

        System.out.println("Q1:Write a Java program to create a new tree set, add some colors (string) and print out the tree set.");
        TreeSet<String>color=new TreeSet<>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Green");
        color.add("Yellow");
        System.out.println("color Treeset :"+color);
        System.out.println("************");

        System.out.println("Q2. Write a Java program to iterate through all elements in a tree set.");
        System.out.println("Iterate through all element in a TreeSet");
        for(String s: color)
        {
            System.out.println(s);
        }
        System.out.println("********");

        System.out.println("Q3. Write a Java program to add all the elements of a specified tree set to another tree set.");

         TreeSet<String>fruit=new TreeSet<>();
         fruit.add("Mango");
         fruit.add("apple");
         color.addAll(fruit);
        System.out.println("Color Treeset elements:  "+color);
        System.out.println("fruit Treeset elements:   "+fruit);
        System.out.println("Color Treeset after adding fruit Treeset :    "+color);
        System.out.println("********");

        System.out.println("Q4. Write a Java program to create a reverse order view of the elements contained in a given tree set.");
        Set<String> reverseSet = color.descendingSet();

        Iterator<String> itr = reverseSet.iterator();

        System.out.println("Reverse order view of elements: ");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("*********");


        System.out.println("Q 5. Write a Java program to get the first and last elements in a tree set");
        System.out.println(color);
        System.out.println("first element :  "+color.first());
        System.out.println("Last  element:   "+color.last());


    }
}
