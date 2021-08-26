// Задача №3066. Среднее значение последовательности

import java.util.Scanner;

public class Program3_2_2_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        double s = 0;
        int n = -1;
        do {
            a = in.nextInt();
            s += a;
            n++;
        }
        while (a != 0);
        System.out.print(s / n);
        in.close();
    }
}