// Задача №2961. Упорядочить три числа

import java.util.Scanner;

public class Program2_AE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int tmp;

        if (b < a) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (c < b) {
            tmp = b;
            b = c;
            c = tmp;
        }
        if (b < a) {
            tmp = a;
            a = b;
            b = tmp;
        }
        System.out.print(a + " " + b + " " + c);
    }
}