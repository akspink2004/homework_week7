package home_work_3;

import java.util. Scanner;
public class Prog5a {
//    static String name = "Akshit", Subject = "Mark";
//    static int RollNo = 8, Maths = 98, Science = 98, English = 85, Total = Maths + Science + English;
    static String name;
    static int RollNo,Maths,Science,English,Total = Maths+Science+English;
    static double Per = (Total * 100 / 300);

    public static void main(String[] args) {
        Scanner Sc = new  Scanner(System.in);
        System.out.println("Enter Name :" );
        name = Sc.next();
        System.out.println("Enter RollNo :");
        RollNo = Sc.nextInt();
        System.out.println("Enter Maths marks :");
        Maths = Sc.nextInt();
        System.out.println("Enter Science marks :");
        Science = Sc.nextInt();
        System.out.println("Enter English marks :");
        English = Sc.nextInt();
        int Total = Maths+Science+English;
        double Per = (Total*100/300);
        System.out.println("--------------------------------");
        System.out.println("|                              |");
        System.out.println("|        Mark Sheet            |");
        System.out.println("|______________________________|");
        System.out.println("|    Name      :   " + name + "      |");
        System.out.println("|    Roll No   :   " + RollNo + "           |");
        System.out.println("|------------------------------|");
        System.out.println("|    Subjects  :    Marks      |");
        System.out.println("|------------------------------|");
        if (Maths <= 100 && Maths >= 0) {
            System.out.println("|     Maths     :   " + Maths + "         |");
        } else {
            System.out.println("“Invalid Input");
        }
        if (Science <= 100 && Science >= 0) {
            System.out.println("|     Science     :   " + Science + "       |");
        } else {
            System.out.println("“Invalid Input");
        }
        if (English <= 100 && English >= 0) {
            System.out.println("|     English     :   " + English + "       |");
        } else {
            System.out.println("“Invalid Input");
        }
            System.out.println("|                              |");
            System.out.println("|------------------------------|");
            System.out.println("|    Total       :    "+Total+"      |");
            System.out.println("|------------------------------|");
            System.out.println("|   Percetage  :     "+Per+" %    |");
        if (Per >= 35) {
            System.out.println("|    Result     :     Pass     |");
        } else {
            System.out.println("|    Result      :    Fail     |");
        }
        if (Per >= 80) {
            System.out.println("|    Grade       :     A+      |");
        } else if (Per <= 80 && Per >= 60){
            System.out.println("|    Grade       :     A       |");
        } else if (Per <= 60 && Per >= 50 ) {
            System.out.println("|    Grade       :     B       |");
        } else if (Per <= 50 && Per >= 35) {
            System.out.println("|    Grade       :     C       |");
        }else {
            System.out.println("Fail");
        }
        System.out.println("|------------------------------|");

        }
    }

