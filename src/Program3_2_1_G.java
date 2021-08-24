// Задача №3063. Банковские проценты

import java.util.Scanner;

public class Program3_2_1_G{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double p = in.nextDouble();
        double y = in.nextDouble();
        int k = 0;
        while(x < y) {
            x *= 100 + p;
            x = (int)x;
            x /= 100;
            k++;
        }
        System.out.print(k);
        in.close();
    }
}





