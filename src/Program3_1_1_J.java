// Задача №318. Степень

import java.util.Scanner;

public class Program3_1_1_J{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        double q = 1;
        for(int i = 1; i <= n; i++) {
            q *= a;
        }
        System.out.print(q);
    }
}
