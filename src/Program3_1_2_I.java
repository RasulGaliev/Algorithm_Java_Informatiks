// Задача №341. Количество делителей

import java.util.Scanner;

public class Program3_1_2_I{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = 0;
        for(int i = 1; i <= Math.sqrt(x); i++)
            if(x % i == 0)
                n++;
        if ((int)Math.sqrt(x) * (int)Math.sqrt(x) == x)
            System.out.print(2 * n - 1);
        else
            System.out.print(2 * n);
        in.close();
    }
}