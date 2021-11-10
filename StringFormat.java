package com.company;

public class StringFormat {
    public static void main(String[] args) {

        String name = "Shishir";
        int age = 20;
        double pi = 3.1415;

        System.out.printf("%s\n", name);
        System.out.printf("%c\n", name.charAt(0));
        System.out.printf("%.3f\n", pi);
        System.out.printf("%d", age);

    }
}
