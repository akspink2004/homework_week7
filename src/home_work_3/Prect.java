package home_work_3;
import java.util.Scanner;
public class Prect {
    static String name = "Akshit", Subject = "Mark";
    static int RollNo = 8, Maths = 98, Science = 98, English = 85, Total = Maths + Science + English;
    static double Per = (Total * 100 / 300);

    public static void main(String[] args) {
        char name;
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("|                              |");
        System.out.println("|        Mark Sheet            |");
        System.out.println("|______________________________|");
     //   name = in.next().charAt(0);
        String a = in.next();
        System.out.println("|    Name      :   " + a +  "      |");

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
