//Задача №1475. k-я секунда суток

import java.util.Scanner;

public class Program4_1_C
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int h = k / 3600;
        int m = k % 3600 / 60;
        System.out.print("It is " + h + " hours " + m + " minutes.");
    }
}
