// Задача №254. Ладья

import java.util.Scanner;

public class Program2_G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(a == c || b == d)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}