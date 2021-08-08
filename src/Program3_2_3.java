// Задача №114. Сумма цифр числа
// Напишите функцию int SumOfDigits (int n), вычисляющую сумму цифр числа N.

import java.util.Scanner;

public class Program3_2_3 {
    static int SumOfDigits (int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(SumOfDigits(n));
        in.close();
    }
}