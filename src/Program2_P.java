// Задача №262. Сдача

import java.util.Scanner;

public class Program2_P {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = c - a;
        int f = d - b;
        if (f < 0) {
            e--;
            f += 100;
        }
        if (f >= 100) {
            f -= 100;
            e++;
        }
        System.out.print(e + " " +  f);
    }
}

