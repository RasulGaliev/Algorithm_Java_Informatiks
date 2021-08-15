// Задача №295. Существует ли треугольник?

import java.util.Scanner;

public class Program2_T {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a + b > c && b + c > a && a + c > b)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}