// Задача №296. Количество равных из трех

import java.util.Scanner;

public class Program2_U {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a == b && b == c)
            System.out.print(3);
        else if (a == b || b == c  || c == a)
            System.out.print(2);
        else
            System.out.print(0);
    }
}