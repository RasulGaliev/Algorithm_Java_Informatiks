// Задача №294. Максимум из трех

import java.util.Scanner;

public class Program2_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max;
        if(a > b) {
            if (a > c)
                max = a;
            else
                max = c;
        }
        else if (b > c)
            max = b;
        else
            max = c;
        System.out.print(max);
    }
}