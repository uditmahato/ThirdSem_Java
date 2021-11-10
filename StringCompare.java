package com.company;

import java.util.Scanner;

public class StringCompare {
    String name1;
    String name2;
    String name3;


    public StringCompare(){
        this.name1 = "shishir";
        this.name2 = "SHISHIR";
        this.name3 = "Ram";
    }

    public StringCompare(String name1, String name2, String name3){
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }

    public static void main(String[] args) {
        char ex;
        String name11;
        String name22;
        String name33;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to use default value? (y/n): ");
        ex = sc.next().charAt(0);

        while (ex == 'y'){
            StringCompare sCompare = new StringCompare();
            System.out.println(sCompare.name1 == sCompare.name2);
            System.out.println(sCompare.name1.equals(sCompare.name3));
            System.out.println(sCompare.name1.equalsIgnoreCase(sCompare.name2));
            System.out.println(sCompare.name2.compareTo(sCompare.name3));
            System.exit(0);
        }


        System.out.println("Enter any three names:");
        name11 = sc.next();
        name22 = sc.next();
        name33 = sc.next();


        StringCompare sCompare = new StringCompare(name11, name22, name33);
        System.out.println(sCompare.name1 == sCompare.name2);
        System.out.println(sCompare.name1.equals(sCompare.name3));
        System.out.println(sCompare.name1.equalsIgnoreCase(sCompare.name2));
        System.out.println(sCompare.name2.compareTo(sCompare.name3));









    }
}


