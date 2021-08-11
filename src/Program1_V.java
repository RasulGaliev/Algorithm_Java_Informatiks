//Задача №2958. Максимум

import java.util.Scanner;

public class Program1_V {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        int b =  in.nextInt();
        System.out.print(a * (int)((int)(a / (b - 0.000001)) / ((int)(a / (b - 0.000001)) - 0.000001)) + b * (int)((int)(b / (a - 0.000001)) / ((int)(b / (a - 0.000001)) - 0.000001)) - a * ((int)(a / (b - 0.000001)) * (int)(b / (a - 0.000001))));
        in.close();
    }
}