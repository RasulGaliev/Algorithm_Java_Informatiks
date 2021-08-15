// Задача №304. Билеты на метро

import java.util.Scanner;

public class Program2_Y {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, b, c;
        a = n / 60;
        b = n % 60 / 10;
        c = n % 10;
        if (b * 125 + c * 15 >= 440 && (b + 1) * 125 >= 440) {
            a++;
            b = 0;
            c = 0;
        }
        else if ((b + 1) * 125 <=(b * 125 + c * 15)){
            b++;
            c = 0;
        }
        System.out.print(c + " " + b + " " + a);
    }
}