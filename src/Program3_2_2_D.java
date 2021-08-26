// Задача №3067. Количество четных элементов последовательности

import java.util.Scanner;

public class Program3_2_2_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n = -1;
        do {
            a = in.nextInt();
            if(a % 2 == 0)
            n++;
        }
        while (a != 0);
        System.out.print(n);
        in.close();
    }
}