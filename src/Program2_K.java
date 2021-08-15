//Задача №257. Конь

import java.util.Scanner;

public class Program2_K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(a - c == 1 && (b - d == 2 || d - b == 2) || c - a == 1 && (b - d == 2 || d - b == 2) || a - c == 2 && (b - d == 1 || d - b == 1) || c - a == 2 && (b - d == 1 || d - b == 1))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}