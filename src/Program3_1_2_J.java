// Задача №342. Сумма ста

import java.util.Scanner;

public class Program3_1_2_J{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int s = 0;
        for(int i = 0; i < 100; i++) {
            x = in.nextInt();
            s += x;
        }
        System.out.print(s);
        in.close();
    }
}