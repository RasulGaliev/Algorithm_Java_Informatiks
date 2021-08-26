//Задача №3065. Сумма последовательности

import java.util.Scanner;

public class Program3_2_2_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int s = 0;
        do {
            a = in.nextInt();
            s += a;
        }
        while (a != 0);
        System.out.print(s);
        in.close();
    }
}