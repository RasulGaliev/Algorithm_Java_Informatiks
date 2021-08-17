// Задача №351. Факториал

import java.util.Scanner;

public class Program3_1_1_B{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int f = 1;
        for(int i = 2; i <= N; i++)
            f *= i;
        System.out.print(f);
        in.close();
    }
}