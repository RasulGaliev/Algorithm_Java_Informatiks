// Задача №2956. Симметричное число

import java.util.Scanner;

public class Program1_T {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        System.out.print((n / 1000 - n % 10) + (n / 100 % 10 - n % 100 / 10) + (n / 1000 - n % 10) * (n / 100 % 10 - n % 100 / 10) + 1);
        in.close();
    }
}