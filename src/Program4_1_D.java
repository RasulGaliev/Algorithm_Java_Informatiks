// Задача №1476. Часовая стрелка

import java.util.Scanner;

public class Program4_1_D {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        short d = in.nextShort();
        int h = d / 30;
        int m = d % 30 * 2;
        System.out.print("It is " + h + " hours " + m + " minutes.");
    }
}
