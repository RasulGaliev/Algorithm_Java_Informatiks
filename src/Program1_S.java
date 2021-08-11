//Задача №2955. Улитка

import java.util.Scanner;

public class Program1_S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h =  in.nextInt();
        int a =  in.nextInt();
        int b =  in.nextInt();
        System.out.print((h - a) / (a - b) + /*(h / a / (h / a + a / h))*/ 1 + (int)((h - a) % (a - b) / ((h - a) % (a - b) - 0.000000001)));//((h - a)  % (a - b) / ((h - a)  % (a - b) + (h - a)  / (a - b) * (a - b) / (h - a))));
        in.close();
    }
}