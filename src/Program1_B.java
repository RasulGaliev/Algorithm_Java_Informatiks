// Задача №2937. Следующее и предыдущее
//The next number for the number 179 is 180.
//The previous number for the number 179 is 178.

import java.util.Scanner;

public class Program1_B{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("The next number for the number " + a + " is " + (a + 1) + '.' + "\n");
        System.out.print("The previous number for the number " + a + " is " + (a - 1) + '.');
        in.close();
    }
}