package com.company;

public class Parallelogram {
    int base;
    int height;

    Parallelogram(int b, int h){
        this.base = b;
        this.height = h;
    }

    void displayInfo(){
        System.out.println("Height: " + height + "\tBase: " + base);
    }
    int calculateArea(){
        int area = base * height;
        return area;
    }

    int calculateArea2(int base1, int height1){
        return base1 * height1;
    }


    public static void main(String[] args) {
        Parallelogram pg1  = new Parallelogram(3,4);
        pg1.displayInfo();
        pg1.calculateArea2(10,12);

        if (pg1.calculateArea2(10,12) > pg1.calculateArea() ){
            System.out.println("Parallelogram 2 is bigger than Parallelogram 1.");
        }
        else{
            System.out.println("Parallelogram 1 is bigger than Parallelogram 2.");

        }



    }
}
