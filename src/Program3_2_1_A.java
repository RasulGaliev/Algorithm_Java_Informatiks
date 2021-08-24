// Задача №113. Список квадратов
// Необходимо вывести  все точные квадраты натуральных чисел, не превосходящие данного числа N.

import java.util.Scanner;

public class Program3_2_1_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int s = 1;
        int i = 1;
        while (s <= N) {
            System.out.print(s + "\n");
            i++;
            s = i * i;
        }
        in.close();
    }
}