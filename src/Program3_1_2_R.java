// Задача №350. Количество решений

import java.util.Scanner;

public class Program3_1_2_R{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int n = 0;
        for(int x = 0; x <= 1000; x++){
            if (x == e)
                continue;
            if(a * x * x * x + b * x * x + c * x + d == 0)
                n++;
        }
        System.out.print(n);
        in.close();
    }
}