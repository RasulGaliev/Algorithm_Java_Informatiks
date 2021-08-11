//Задача №2949. Обмен значений
//Напишите программу, которая считывает значения двух целочисленных переменных a и b, затем меняет их значения местами

import java.util.Scanner;

public class Program1_M{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int tmp = a;
        a = b;
        b = tmp;
        System.out.print(a + " " + b);
        in.close();
    }
}