package home_work_3;

public class Prog20 {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;

        for (int i : array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
