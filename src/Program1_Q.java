//Задача №2953. Автопробег

import java.util.Scanner;

public class Program1_Q {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int m =  in.nextInt();
        System.out.print(m / n + (m % n / (m % n + m / n * n / m)));
        in.close();
    }
}

