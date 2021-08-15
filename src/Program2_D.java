// Задача №2959. Знак числа

import java.util.Scanner;

public class Program2_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n > 0)
            System.out.print(1);
        else if (n < 0)
            System.out.print(-1);
        else
            System.out.print(0);
    }
}