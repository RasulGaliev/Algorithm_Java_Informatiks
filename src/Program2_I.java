// Задача №256. Ферзь

import java.util.Scanner;

public class Program2_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(a - c == b - d || a - c == d - b || a == c || b == d)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}