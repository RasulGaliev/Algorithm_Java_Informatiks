// Задача №2936. Гипотенуза
// Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.

import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double c;
        c = Math.sqrt(a * a + b * b);
        System.out.print(c);
        in.close();
    }
}