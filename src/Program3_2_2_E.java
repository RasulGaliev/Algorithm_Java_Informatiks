// Задача №3068. Максимум последовательности

import java.util.Scanner;

public class Program3_2_2_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int max = 0;
        do {
            a = in.nextInt();
            if(a > max)
                max = a;
        }
        while (a != 0);
        System.out.print(max);
        in.close();
    }
}