// Задача №3080. Наименьшее расстояние между локальными максимумами

import java.util.Scanner;

public class Program3_2_2_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int min_n = 2000000000;
        int sled;
        int pred = in.nextInt();
        int a = in.nextInt();
        if(a != 0)
            while (true) {
                sled = in.nextInt();
                if(a > pred && a > sled){
                    if(n < min_n)
                        n = min_n;
                    n = 1;
                }
                if(sled == 0)
                    break;
                else
                    n++;
                pred = a;
                a = sled;
            }
        System.out.print(min_n);
        in.close();
    }
}