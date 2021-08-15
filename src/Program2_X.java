// Задача №303. Коровы

import java.util.Scanner;

public class Program2_X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n / 10 != 1 && n % 10 == 1)
            System.out.print(n + " korova");
        else if (n / 10 != 1 && (n % 10 == 2 || n % 10 == 3 || n % 10 == 4))
            System.out.print(n + " korovy");
        else
            System.out.print(n + " korov");
    }
}