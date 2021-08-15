// Задача №265. Котлеты

import java.util.Scanner;

public class Program2_R {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        if (n < k && n != 0)
            System.out.print(2 * m);
        else if(n % k == 0)
            System.out.print(2 * n / k * m);
        else if(n % k < k / 2 || n % k * 2 == k)
            System.out.print((n / k * 2 + 1) * m);
        else
            System.out.print((n / k + 1) * 2 * m);
    }
}

