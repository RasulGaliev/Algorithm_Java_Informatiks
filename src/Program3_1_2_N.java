// Задача №346. Подсчет чисел

import java.util.Scanner;

public class Program3_1_2_N{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x;
        int k = 0, m = 0, n = 0;
        for(int i = 0; i < N; i++) {
            x = in.nextInt();
            if(x > 0)
                m++;
            else if(x == 0)
                k++;
            else
                n++;
        }
        System.out.print(k + " " + m + " " + n);
        in.close();
    }
}