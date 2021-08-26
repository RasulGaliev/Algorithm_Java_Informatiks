// Задача №3072. Количество элементов, равных максимуму

import java.util.Scanner;

public class Program3_2_2_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int max = 0;
        int n = 0;
        do {
            a = in.nextInt();
            if(a > max){
                max = a;
                n = 1;
            }
            else if(a == max)
                n++;
        }
        while (a != 0);
        System.out.print(n);
        in.close();
    }
}