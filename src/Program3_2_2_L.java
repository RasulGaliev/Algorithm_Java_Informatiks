// Задача №3078. Максимальная длина монотонного фрагмента

import java.util.Scanner;

public class Program3_2_2_L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n = 1;
        int m = 1;
        int max_n = 0;
        int max_m = 0;
        int pred = in.nextInt();
        do {
            a = in.nextInt();
            if(a == 0){
                max_m = Math.max(max_m, m);
                max_n = Math.max(max_n, n);
            }
            else if(a < pred) {
                if(n > max_n)
                    max_n = n;
                n = 1;
                m++;
            }
            else if(a > pred){
                if(m > max_m)
                    max_m = m;
                n++;
                m = 1;
            }
            else{
                if(n > max_n)
                    max_n = n;
                if(m > max_m)
                    max_m = m;
                n = 1;
                m = 1;
            }
            pred = a;
        }
        while (a != 0);
        System.out.print(Math.max(max_n, max_m));
        in.close();
    }
}