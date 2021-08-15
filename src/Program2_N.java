// Задача №260. Уравнение

import java.util.Scanner;

public class Program2_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a == 0 && b == 0)
            System.out.print("INF");
        else if(a != 0 && b / a * a == b )
            System.out.print(- b / a);
        else
            System.out.print("NO");
    }
}

// ax = -b