// Задача №305. Билеты на метро - 2

import java.util.Scanner;

public class Program2_Z {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, b, c, d, e;
        a = n / 60;
        b = n % 60 / 20;
        c = n % 20 / 10;
        d = n % 10 / 5;
        e = n % 5;
        if (b * 230 + c * 125 + d * 70 + e * 15 >= 440 && b * 230 + c * 125 + (d + 1) * 70 >= 440 && b * 230 + (c + 1) * 125  >= 440 && (b + 1) * 230  >= 440) {
            a++;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
        }
        else if (230 <= c * 125 + d * 70 + e * 15) {
            b++;
            c = 0;
            d = 0;
            e = 0;
        }
        else if (125 <= d * 70 + e * 15){
            c++;
            d = 0;
            e = 0;
        }
        else if (70 <= e * 15) {
            d++;
            e = 0;
        }
        System.out.print(e + " " + d + " " + c + " " + b + " " + a);
    }
}