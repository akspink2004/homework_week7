package home_work_3;

import java.util.Scanner;
public class Prog5 extends Exception{

        public static void main(String args[]) {
            char name;
            Scanner in = new Scanner(System.in);
            System.out.println("------------------------------------------");
            System.out.println("|                                        |");
            System.out.println("|          Mark sheet                    |");
            System.out.println("|----------------------------------------|");
            System.out.print("|        Name        :            ");
            //System.out.print("                                           |");
             name = in.next().charAt(0);
            System.out.print("Enter class of student:");
            int c = in.nextInt();
            System.out.print("Enter roll no of student:");
            int r = in.nextInt();
            System.out.print(" Math: ");
            int m1 = in.nextInt();
            System.out.print(" Science: ");
            int m2 = in.nextInt();
            System.out.print(" English: ");
            int m3 = in.nextInt();
            int t = m1 + m2 + m3 ;
            double p = t / 100.0 * 300.0;
            String g = "";
            if (p >= 90)
                g = "A+";
            else if (p >= 80)
                g = "A";
            else if (p >=70)
                g = "B+";
            else if (p >= 60)
                g = "B";
            else if (p >= 50)
                g = "C";
            else if (p >= 40)
                g = "D";
            else
                g = "E";

            System.out.println("Total Marks = " + t);
            System.out.println("Percentage = " + p);
            System.out.println("Grade = " + g);
        }
    }

