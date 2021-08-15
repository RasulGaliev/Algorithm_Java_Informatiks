// Задача №293. Какое из чисел больше?

import java.util.Scanner;

public class Program2_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a > b)
            System.out.print(1);
        else if(b > a)
            System.out.print(2);
        else
            System.out.print(0);
    }
}