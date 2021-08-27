// Задача №119. Количество палиндромов

import java.util.Scanner;

public class Program3_2_3_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int K = in.nextInt();
        for(int i = 1; i <= K; i++) {
            if (i / 10 == 0)
                n++;
            else if(i / 100 == 0){
                if(i / 10 == i % 10)
                    n++;
            }
            else if(i / 1000 == 0){
                if(i / 100 == i % 10)
                    n++;
            }
            else if(i / 10000 == 0){
                if(i / 1000 == i % 10 && i % 1000 / 100 == i % 100 / 10)
                    n++;
            }
            else if(i / 100000 == 0){
                if(i / 10000 == i % 10 && i % 10000 / 1000 == i % 100 / 10)
                    n++;
            }
        }
        System.out.print(n);
        in.close();
    }
}