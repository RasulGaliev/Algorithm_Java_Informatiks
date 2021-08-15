// Задача №295. Существует ли треугольник?

import java.util.Scanner;

public class Program2_W {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a + b <= c || b + c <= a || a + c <= b)
            System.out.print("impossible");
        else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
            System.out.print("right");
        else if (a * a + b * b < c * c || b * b + c * c < a * a || a * a + c * c < b * b)
            System.out.print("obtuse");
        else
            System.out.print("acute");
    }
}