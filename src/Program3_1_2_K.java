// Задача №343. Сумма чисел

import java.util.Scanner;

public class Program3_1_2_K{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x;
        int s = 0;
        for(int i = 0; i < N; i++) {
            x = in.nextInt();
            s += x;
        }
        System.out.print(s);
        in.close();
    }
}