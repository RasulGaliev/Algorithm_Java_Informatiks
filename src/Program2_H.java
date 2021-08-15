// Задача №255. Слон

import java.util.Scanner;

public class Program2_H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(a - c == b - d || a - c == d - b)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}