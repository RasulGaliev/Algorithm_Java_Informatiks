// Задача №301. Квадратное уравнение

import java.util.Scanner;

public class Program2_V {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d = b * b - 4 * a * c;
        if (d > 0)
            System.out.print((-b - Math.sqrt(d)) / (2 * a) + " " + (-b + Math.sqrt(d)) / (2 * a));
        else if(d == 0)
            System.out.print(- b / (2 * a));
    }
}
