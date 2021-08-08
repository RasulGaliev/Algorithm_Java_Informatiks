// Задача №315. Сумма квадратов
// По данному натуральному n вычислите сумму 1^2+2^2+...+n^2.

import java.util.Scanner;

public class Program3_1_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++)
            sum += i * i;
        System.out.print(sum);
        in.close();
    }
}