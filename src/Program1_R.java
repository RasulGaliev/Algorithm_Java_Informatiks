//Задача №2954. Дележ яблок - 3

import java.util.Scanner;

public class Program1_R {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int k =  in.nextInt();
        System.out.print(n * (int)(k % n / (k % n  - 0.000000001))- k % n);
        in.close();
    }
}