package com.company.week3.day1.EXercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProgramLinkedlist {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a linked list.
        //2. Write a Java program to iterate through all elements in a linked list.
        //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        //4. Write a Java program to iterate a linked list in reverse order.
        //5. Write a Java program to insert the specified element at the specified position in the linked list.


        System.out.println("Q1: Program to append the specified element to the end of a Linked List");
        LinkedList<String> words = new LinkedList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        System.out.println("Original List" + words);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to Append");
        String word1 = input.next();
        //System.out.println(word1);
        words.add(word1);
        System.out.println("List after Append" + words);
        System.out.println("**********");

        System.out.println("Q2: Write a Java program to iterate through all elements in a linked list.");
        Iterator iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("***********");

        System.out.println("Q3:Write a Java program to iterate through all elements in a linked list starting at the specified position.");
        System.out.println("Enter the index number from where you want to start?");

        Scanner input2=new Scanner(System.in);
         int select =input2.nextInt();
      //this will also print list like iterator
       /*  for(String s: words) {
             System.out.println(s);
         }*/
        for(int a=select;a<words.size();a++){
            System.out.println(words.get(a));
        }
        System.out.println("*********");

        System.out.println("Q4:Write a Java program to iterate a linked list in reverse order.");
         for(int b= words.size()-1;b>=0;b--)
         {
             System.out.println(words.get(b));
         }
        System.out.println("***********");
        System.out.println("Q5: Write a Java program to insert the specified element at specified position in linked list");
        System.out.println("Enter element want to insert");
        Scanner ele=new Scanner(System.in);
        String element=ele.next();
        System.out.println("Enter the index number where want to insert the specified element");
        Scanner ind=new Scanner(System.in);
        int index=ind.nextInt();
        words.add(index,element);
        System.out.println(words);
    }
}