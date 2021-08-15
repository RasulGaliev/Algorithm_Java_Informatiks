// Задача №259. Фишки

import java.util.Scanner;

public class Program2_M {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if (k % 4 == 0 || k == 1 || k == 2)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
