// Задача №3079. Количество локальных максимумов

import java.util.Scanner;

public class Program3_2_2_M {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int sled;
        int pred = in.nextInt();
        int a = in.nextInt();
        if(a != 0)
            while (true) {
                sled = in.nextInt();
                if(sled == 0)
                    break;
                if(a > pred && a > sled)
                    n++;
                pred = a;
                a = sled;
            }
        System.out.print(n);
        in.close();
    }
}