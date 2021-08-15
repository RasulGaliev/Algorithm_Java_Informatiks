// Задача №1445. Координаты соседей

import java.util.Scanner;

public class Program2_AA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        if (x + 1 <= M)
            System.out.print((x + 1) + " " + y + "\n");
        if (x - 1 >= 1)
            System.out.print((x - 1) + " " + y + "\n");
        if (y + 1 <= N)
            System.out.print(x + " " + (y + 1) + "\n");
        if (y - 1 >= 1)
            System.out.print(x + " " + (y - 1) + "\n");
    }
}