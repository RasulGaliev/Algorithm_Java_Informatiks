// Задача №1479. Без циклов

import java.util.Scanner;

public class Program4_1_E
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        short k = in.nextShort();
        short n = in.nextShort();
        int number_page = n / k + (int)(n % k / (n % k - 0.1));
        int number_string = n % k + k * (1 - (int)(n % k / (n % k - 0.1)));
        System.out.print(number_page + " " + number_string);
    }
}
