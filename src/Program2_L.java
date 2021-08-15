//Задача №258. Шоколадка

import java.util.Scanner;

public class Program2_L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        if ((k % n == 0 || k % m == 0) && k <= m * n)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}