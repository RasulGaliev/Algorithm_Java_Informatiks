// Задача №298. Король

import java.util.Scanner;

public class Program2_J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(a - c  == 1  && (b - d == 1 ||  d - b == 1)  || c - a  == 1  && (b - d == 1 ||  d - b == 1)  || a == c && (b - d == 1 || d - b == 1)|| b == d && (a - c == 1 || c - a == 1))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}