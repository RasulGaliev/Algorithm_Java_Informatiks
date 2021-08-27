// Задача №116. Минимальная и максимальная цифры

import java.util.Scanner;

public class Program3_2_3_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k;
        int min = 9;
        int max = 0;
        int N = in.nextInt();
        do{
            k = N % 10;
            if(k > max)
                max = k;
            if(k < min)
                min = k;
            N /= 10;
        }
        while(N != 0);
        in.close();
        System.out.print(min + " " + max);
    }
}