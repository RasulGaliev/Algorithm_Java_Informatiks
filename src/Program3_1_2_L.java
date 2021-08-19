// Задача №344. Перевод числа

import java.util.Scanner;

public class Program3_1_2_L{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int q = 1;
        int s = 0;
        for(int i = 0; x != 0; i++) {
            s += x % 10 * q;
            x /= 10;
            q *= 2;
        }
        System.out.print(s);
        in.close();
    }
}