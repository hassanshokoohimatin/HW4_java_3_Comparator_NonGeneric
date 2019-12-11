package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(new Student(101, "Vahid", 23));
        al.add(new Student(106, "Ali", 27));
        al.add(new Student(105, "Jalal", 21));

        System.out.println("Sorting by Name");

        Collections.sort(al, new NameComparator());
        for(Object o : al) {
            System.out.println(o);
            System.out.println("\t");
        }
        System.out.println("\n");

        System.out.println("Sorting by age");

        Collections.sort(al, new AgeComparator());
        for(Object o : al) {
            System.out.println(o);
            System.out.println("\t");
        }

    }
}
