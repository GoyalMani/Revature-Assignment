package com.company.week3.day4;

import java.io.*;
import java.util.Scanner;

       /*1. Write a Java program to get a list of all file/directory names from the given.
        2. Write a Java program to get specific files by extensions from a specified folder.
        3. Write a Java program to check if a file or directory specified by pathname exists or not.
        4. Write a Java program to check if given pathname is a directory or a file.
        5. Write Java program to read input from java console.
        6. Write a Java program to read a file content line by line.
        7. Write a Java program to read first 3 lines from a file
        8. Write a Java program to find the longest word in a text file.*/

public class Ex {
    public static void main(String[] args) throws IOException {
        System.out.println("Q1-Write a Java program to get a list of all file/directory names from the given.");
        int count = 0;
        File file = new File("data");
        String[] list = file.list();
        System.out.println("List of all File/Directory");
        for (String s : list) {
            count++;

            System.out.println(s);
        }
        System.out.println("**********");
        System.out.println("Q2- Write a Java program to get specific files by extensions from a specified folder");

        int number = 0;
        File file2 = new File("data");
        String[] list1 = file2.list();
        for (String m : list1) {
            File f = new File(file, m);
            if (f.isFile()) {
                System.out.println(m);
                number++;
            }
        }
        System.out.println("No of file  " + number);
        System.out.println("*********");

        System.out.println("Q3. Write a Java program to check if a file or directory specified by pathname exists or not.");

        File file3 = new File("data/base");
        //System.out.println(file3.exists());
        boolean l = file3.exists();
        // System.out.println(l);
        if (l == true) {
            System.out.println("file/directory specified by path name exists");
        } else {
            System.out.println("file/directory specified by path name does not exist");
        }
        System.out.println("**********");
        System.out.println(" 4. Write a Java program to check if a given pathname is a directory or a file.");

        //int check=0;
        File file4 = new File("data/first.txt");
        boolean a = file4.isDirectory();
        boolean b = file4.isFile();
        if (a == true) {
            System.out.println("Given pathname is a directory");
        } else if (b == true) {
            System.out.println("Given pathname is a file");
        } else {
            System.out.println("neiher directory nor file");
        }
        System.out.println("***************");
        System.out.println("Q5. Write Java program to read input from java console.");
        FileWriter fw = new FileWriter("Data/first.txt", false);
        fw.write('\n');
        fw.write("welcome to java program");
        fw.write('\n');
        fw.write("This is first line");
        fw.write('\n');
        fw.write("This is second line");
        fw.write('\n');
        fw.write("This is third line");
        fw.flush();
        fw.close();
        System.out.println("******");

        System.out.println("Q6. Write a Java program to read a file content line by line");
        File in = new File("data/second.txt");
        Scanner sc = new Scanner(in);
        System.out.println("content of File Line by line");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        System.out.println("********");
        System.out.println("Q 7. Write a Java program to read first 3 lines from a file");
        File fg = new File("data", "second.txt");
        String line = null;
        FileReader fr = new FileReader(fg);
        BufferedReader br = new BufferedReader((fr));
        for (int i = 0; i < 3; i++) {
            line = br.readLine();
            System.out.println(line);
        }
        System.out.println("**********");
        System.out.println("Q 8. Write a Java program to find the longest word in a text file.");
        String lword = "";
        String cword;
        Scanner sc1 = new Scanner(in);
        while (sc1.hasNext()) {
            cword = sc1.next();//next(String pattern
            if (cword.length() > lword.length()) {
                lword = cword;
            }
        }
        System.out.println("Longest word in the file  "+(in)+ "   is" +"  "+lword);
        
    }
}
