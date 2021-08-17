// Задача №352. Степень

import java.util.Scanner;

public class Program3_1_1_C{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int f = 1;
        for(int i = 1; i <= N; i++)
            f *= 2;
        System.out.print(f);
        in.close();
    }
}