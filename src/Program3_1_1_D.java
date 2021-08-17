// Задача №317. Число сочетаний

import java.util.Scanner;

public class Program3_1_1_D{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int f_n = 1, f_k = 1, f_nk = 1;
        for(int i = 2; i <= n; i++)
            f_n *= i;
        for(int i = 2; i <= k; i++)
            f_k *= i;
        for(int i = 2; i <= n - k; i++)
            f_nk *= i;
        System.out.print(f_n / (f_k * f_nk));
        in.close();
    }
}