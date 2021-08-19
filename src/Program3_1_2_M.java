// Задача №345. Нули

import java.util.Scanner;

public class Program3_1_2_M{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x;
        int n = 0;
        for(int i = 0; i < N; i++) {
            x = in.nextInt();
            if(x == 0)
                n++;
        }
        System.out.print(n);
        in.close();
    }
}