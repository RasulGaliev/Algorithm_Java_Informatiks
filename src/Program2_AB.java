// Задача №1448. Апельсины бочками

import java.util.Scanner;

public class Program2_AB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 100 / 10 != 1 && n % 10 == 1)
            System.out.print(n + " bochka");
        else if (n % 100 / 10 != 1 && (n % 10 == 2 || n % 10 == 3 || n % 10 == 4))
            System.out.print(n + " bochki");
        else
            System.out.print(n + " bochek");
    }
}