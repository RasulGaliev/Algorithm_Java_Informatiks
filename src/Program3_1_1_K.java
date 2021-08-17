// Задача №316. Факториал

import java.util.Scanner;

public class Program3_1_1_K{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 1;
        for(int i = 1; i <= n; i++)
            f *= i;
        System.out.print(f);
    }
}

