//Задача №2957. Проверьте делимость

import java.util.Scanner;

public class Program1_U {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int m =  in.nextInt();
        System.out.print((n % m) * (m % n) + 1);
        in.close();
    }
}