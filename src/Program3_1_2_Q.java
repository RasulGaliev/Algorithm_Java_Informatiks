// Задача №349. Уравнение по убыванию

import java.util.Scanner;

public class Program3_1_2_Q{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int n = 0;
        for(int x = 1000; x >= 0; x--)
            if(a * x * x * x + b * x * x + c * x + d == 0)
                System.out.print(x + " ");
        in.close();
    }
}