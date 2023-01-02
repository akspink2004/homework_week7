package home_work_3;
//        Write a java program that tells us that Input number is odd or even?
//        HINT: use ternary operator (? :)

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
             Scanner reader = new Scanner (System.in);
        System.out.println("Enter number :- ");

        int num = reader. nextInt();

        if(num % 2 ==0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

    }
}
