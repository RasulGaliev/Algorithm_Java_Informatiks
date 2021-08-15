// Задача №292. Максимум из двух чисел
// Даны два целых числа, каждое число записано в отдельной строке. Выведите наибольшее из данных чисел.

import java.util.Scanner;

public class Program2_A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int max;
        if(x > y)
            max = x;
        else
            max = y;
        System.out.print(max);
        in.close();
    }
}