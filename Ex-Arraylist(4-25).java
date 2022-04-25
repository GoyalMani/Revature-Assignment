package com.company.week3.day1.EXercise;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        //Q1-Write a java program to append the specified element to the end of a linked list
        System.out.println("Q1-Program to append the specified element to the end of list");
        ArrayList<String> element = new ArrayList<>();
        element.add("RED");
        element.add("GREEN");
        element.add("YELLOW");
        element.add("WHITE");

        System.out.println( "Original List"+element);
        //append element at the end of the list
        element.add("ORANGE");
        System.out.println("List after Append"+element);
        System.out.println("*********");

        //Q2- Write a java program to iterate through all elements in a linked list
        System.out.println("Q2-Program to iterate through all elements in a linked list ");

       Iterator iterator = element.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("**********");

        //Q3-Write a java program to iterate through all elements in a llinked list starting at the specified position
        System.out.println("Q3-Program to iterate through all elements in a llinked list starting at the specified position");

        System.out.println("Enter the index number:");
        Scanner number = new Scanner(System.in);
        int index = number.nextInt();
        System.out.println("list started from specified index no  " +index);
        for (int i=index; i< element.size(); i++)
        {

            System.out.println(element.get(i));

        }

        System.out.println("******************");


        //Q4-Write a Java program to iterate a linked list in reverse order. i
        System.out.println("Q4-Program to iterate a linked list in reverse order.");

        System.out.println("Original list"+element);
        //Collections.sort(element3);
        Collections.reverse(element);
        System.out.println("Reverse List");
        for (String elements : element) {
            System.out.println(elements);
        }

        System.out.println("**************");

        //Q5-Write a Java program to insert the specified element at the specified position in the linked list.

        System.out.println("Q5-Program to insert the specified element at the specified position in the linked list");
        System.out.println(element);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter color want to insert ");
        String select = input.next();
        System.out.println(select);
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter the index number where to be inserted");
        int select1 = input1.nextInt();
        System.out.println(select1);
        System.out.println("Original list"+element);
        element.add(select1,select);
        System.out.println("Updated list "+element);

    }


    }


