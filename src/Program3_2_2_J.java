// Задача №3073. Сумма последовательности - 2

import java.util.Scanner;

public class Program3_2_2_J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a_1;
        int a_2 = -1;
        int s = 0;
        do {
            a_1 = a_2;
            a_2 = in.nextInt();
            s += a_2;

        }
        while (a_1 != 0 || a_2 != 0);
        System.out.print(s);
        in.close();
    }
}