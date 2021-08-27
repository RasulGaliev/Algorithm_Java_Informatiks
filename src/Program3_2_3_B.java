// Задача №115. Количество нулей

import java.util.Scanner;

public class Program3_2_3_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int N = in.nextInt();
        do{
            if(N % 10 == 0)
                n++;
            N /= 10;
        }
        while(N != 0);
        in.close();
        System.out.print(n);
    }
}