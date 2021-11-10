package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo_System {
    private static final String Green = "\u001B[92m";
    private static final String Cyan = "\u001B[96m";
    private static final String Smiley = "\uD83D\uDE0A";


    public static void main(String[] args){


        ArrayList <String> items = new ArrayList();
        ArrayList <Integer> price = new ArrayList();
        System.out.println(Cyan + "\n\nWelcome to our shopping system!\n");

        Scanner sc = new Scanner(System.in);
        System.out.println(Green + "Enter the number of items you want to purchase: ");
        int count = sc.nextInt();

        int i;
        for (i=0;i<count;i++){
            System.out.println(Green + "Item Name: ");
            String name = sc.next();
//            items.set(i, name);
            items.add(name);
            System.out.println(Green + "Price of " + name + ": " );
            int amt = sc.nextInt();
//            price.set(i,amt);
            price.add(amt);
        }

        char ex = 0;
        do {
            System.out.println(Green + "Enter:\n 'a' to add an item, " +
                    "'r' to remove an item, 'd' to display the list and 'n' to exit:  ");
            char ch = sc.next().charAt(0);

            if (ch == 'a') {
                System.out.println(Green + "Enter the name of item you want to add: ");
                String addName = sc.next();
                System.out.println(Green + "Enter the price: ");
                int addPrice = sc.nextInt();
                items.add(addName);
//                price.set(i,addPrice);
                price.add(addPrice);
            }

            else if (ch == 'r'){
                System.out.println(Green + "Enter the name of item you want to remove: ");
                String removeName = sc.next();
                int itemIndex = items.indexOf(removeName);

                items.remove(itemIndex);
                price.remove(itemIndex);
            }

            else if (ch == 'd'){
                System.out.println(Green + "Items list: \n --------" +
                        "-----------------------------------------------------------------\n");
                System.out.println(Green + "Name : Price\n");
                int total = 0;
                for (int j=0;j<items.size();j++){
                    System.out.print(items.get(j) + " : " + price.get(j) + "\n");
                    total = total + price.get(j);
                }
                System.out.println(Green + "\n\n Grand Total: " + total);
            }

            System.out.println(Green + "Do you want to continue? (y/n): ");
            ex = sc.next().charAt(0);
        }while (ex == 'y'|| ex == 'a' || ex == 'd' || ex == 'r');

        System.out.println(Cyan + "Thank you for purchasing from us.\n Hope you have a wonderful day! " + Smiley);


    }
}
