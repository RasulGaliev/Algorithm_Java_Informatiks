// Задача №321. Сумма - 2

import java.util.Scanner;

public class Program3_1_1_G{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 1;
        double q = 1;
        for(int i = 1; i <= n; i++) {
            q *= -1;
            sum += q / (2 * i + 1);
        }
        System.out.print(4 * sum);
    }
}
