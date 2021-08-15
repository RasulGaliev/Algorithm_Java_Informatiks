// Задача №261. Сложное уравнение

import java.util.Scanner;

public class Program2_O {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a == 0 && b == 0)
            System.out.print("INF");
        else if(a != 0 && b / a * a == b && c * (- b / a) + d != 0)
            System.out.print(- b / a);
        else
            System.out.print("NO");
    }
}
